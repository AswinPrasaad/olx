package com.spring.OlxService;

import com.spring.model.Registration;

public interface OlxService {

	void add(Registration register);

	Registration validate(Registration user);

}
