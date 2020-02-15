package com.spring.OlxService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.OlxDao.OlXDaoInterface;
import com.spring.model.Registration;
@Service
public class OlxServiceImpl implements OlxService {
	
@Autowired

OlXDaoInterface olxDao;
	
	



	@Override
	@Transactional
	public void add(Registration register) {
		olxDao.add(register);	
	}





	




	@Override
	public boolean getUserObject(Registration user1) {

		 Boolean checkStatus = olxDao.getUserObject(user1);
		 if(checkStatus==true)
		 {
			 return true;
		 }
		 else
			 return false;


	}
	




}
