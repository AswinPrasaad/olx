package com.spring;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.OlxService.OlxService;
import com.spring.model.Registration;


@Controller
@RequestMapping("/")
public class OlxController{

	@Autowired
	 OlxService olxService;
	
	

	@RequestMapping( value="/",method = RequestMethod.GET	)
	public String Login(@ModelAttribute("register") Registration register ) {
        //map.put("register", new Registration());
        
		return "Registration";
	}

	@RequestMapping( value="/add",method = RequestMethod.GET	)
	public String addUser(@ModelAttribute("register") Registration register ) {
       
        olxService.add(register);
		return "Login";
	}
	
	@RequestMapping(value="/loginvalidate")
	public ModelAndView validate(HttpSession session,@ModelAttribute Registration user){
		Registration user1=olxService.validate(user);
		String id=user1.getUserId();
		String name=user1.getFirst_name();
		String psw=user1.getUser_password();
		if((name.equals(user.getUser_password()))&&psw.equals(user.getUser_password())){
			session.setAttribute("uid",id);
			session.setAttribute("uname", name);
			return new ModelAndView("HomePage");
		
		}
		else
			
		return new ModelAndView("redirect:/Login");
		
	}
}	

