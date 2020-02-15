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
	public Registration validate(Registration user) {
		
		return olxDao.validate(user);
	}




}
