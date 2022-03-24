package org.springframework.boot.wl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lang1.wang
 * @date: 2020/11/26 11:38
 */
@Service
public class BService {

	@Autowired
	private AService aService;

	@Autowired
	private PrototypeService prototypeService;


	public void say(){
		System.out.println("BService this:" + this);
		System.out.println("BService bService class to string :" + this.getClass().toString());
		System.out.println("BService aService:" + aService);
		System.out.println("BService prototypeService:" + prototypeService);
	}
}
