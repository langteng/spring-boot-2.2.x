package org.springframework.boot.wl.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class PrototypeService {

	public void say(){
		System.out.println("PrototypeService say :" + this);
	}
}
