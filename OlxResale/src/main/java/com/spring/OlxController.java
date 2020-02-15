package com.spring;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.OlxService.OlxService;
import com.spring.model.Login;
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

	@RequestMapping( value="/add", method = RequestMethod.GET	)
	public String addUser(@ModelAttribute("register") Registration register, ModelAndView model) {
		olxService.add(register);
       model.addObject("registered", "Registered sucessfully");
		return "LoginPage";
	}
	
	@RequestMapping(value="/loginvalidate", method=RequestMethod.POST)
	public String validate(@ModelAttribute("login")Login login, Model model){
		System.out.println(login.getUser_password());
		System.out.println(login.getuser_Id());

		Registration user1=new Registration();
		String id=login.getuser_Id();
		String password=login.getUser_password();
		user1.setUserId(id);
		user1.setUser_password(password);
		if(olxService.getUserObject(user1))
		{
			//List<Vehicle> vehilceList = vehicleService.getAllVehicle();
			return "HomePage";
		}
		else
			model.addAttribute("invalid", "Not a Valid User");
		return "LoginPage";

	
		}
	
	@RequestMapping(value="/home")
	public ModelAndView homePage(HttpSession session,@ModelAttribute() Registration user){
		
			
		return new ModelAndView("HomePage");
		
	}
	
}	

