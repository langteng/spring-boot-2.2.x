package org.springframework.boot.wl.service;

import org.springframework.stereotype.Service;

@Service
public class CServiceImpl implements ICService {

	@Override
	public void say() {
		System.out.println("C Say");
	}
}
