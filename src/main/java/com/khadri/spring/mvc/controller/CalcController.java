package com.khadri.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khadri.spring.mvc.service.CalcService;

@Controller
public class CalcController {

	@Autowired
	private CalcService service;
	
	@RequestMapping("/add")
	public ModelAndView addition(@RequestParam("v1") String value1, @RequestParam("v2") String value2) {
		System.out.println("CalcController : addition(-,-)");
		
		Integer result = service.add(Integer.valueOf(value1), Integer.valueOf(value2));

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("res_add", result);
		modelAndView.setViewName("result_add");

		return modelAndView;

	}

	@RequestMapping("/sub")
	public ModelAndView substraction(@RequestParam("v1") String value1, @RequestParam("v2") String value2) {
		System.out.println("CalcController : substraction(-,-)");

		Integer result = service.sub(Integer.valueOf(value1), Integer.valueOf(value2));

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("res_sub", result);
		modelAndView.setViewName("result_sub");

		return modelAndView;

	}

}