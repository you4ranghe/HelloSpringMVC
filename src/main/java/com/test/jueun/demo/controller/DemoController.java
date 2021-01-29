package com.test.jueun.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.jueun.demo.model.service.DemoService;

//web mvc 프로젝트에서 controller 객체를 SPRING BEAN으로 등록할때는
//@Controller 를 class위에 선언해주면 된다

@Controller
public class DemoController {
	
	@Autowired
	private DemoService service;

}
