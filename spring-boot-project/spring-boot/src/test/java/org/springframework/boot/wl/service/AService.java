package org.springframework.boot.wl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author: lang1.wang
 * @date: 2020/11/26 11:37
 */
@Service
public class AService {

	private BService bService;

	@Autowired
	private PrototypeService prototypeService;

	@Autowired
	private Person person;

	private ICService icService;

	@Lazy
	public AService(BService bService, ICService icService) {
		this.bService = bService;
		this.icService = icService;
	}

	public void say(){
		System.out.println("AService this:" + this);
		System.out.println("AService bService :" + bService);
		System.out.println("AService bService class to string :" + bService.getClass().toString());
		System.out.println("AService prototypeService :" + prototypeService);
		System.out.println("AService Person :" + person);
	}
}
