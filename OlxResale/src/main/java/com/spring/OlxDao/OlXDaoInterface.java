package com.spring.OlxDao;

import com.spring.model.Registration;

public interface OlXDaoInterface  {

	void add(Registration register);

	Registration validate(Registration user);
	
	

}
