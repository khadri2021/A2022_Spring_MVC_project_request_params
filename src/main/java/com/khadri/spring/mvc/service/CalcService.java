package com.khadri.spring.mvc.service;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

	public Integer add(Integer i1, Integer i2) {
		return i1 + i2;
	}
	public Integer sub(Integer i1, Integer i2) {
		return i2 - i1;
	}
}
