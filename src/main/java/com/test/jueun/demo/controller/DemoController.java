package com.test.jueun.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.jueun.demo.model.service.DemoService;

//web mvc 프로젝트에서 controller 객체를 SPRING BEAN으로 등록할때는
//@Controller 를 class위에 선언해주면 된다

@Controller
public class DemoController {
	
	@Autowired
	private DemoService service;
	
	//화면전환
	@RequestMapping("/demo/demoHome.do")
	public String demoHome() {
		
		
		return "demo/demo";
	}
	
	//클라이언트가 전송한 데이터나 요청내용을 mapping 메소드에서 처리하려면
	//HttpRequest로 파라미터 처리하기
	//HttpRequest.get 으로 가져오는 값들을 매개변수로 선언해서 처리할 수이쑈다
	//매개변수를 선언하면 자료형에 맞는 값을 spring이 대입해준다.
	
	//mapping 메소드의 매개변수로 선언할수 있는 타입!?
	// HttpServletRequest / HttpServletResponse 객체
	// HttpSession
	// java.util.Locale 위치,지역을 가져올수있다
	// InputStream, Reader
	// OutputStream, Writer
	
	
	
	@RequestMapping("/demo/demo")
	public String demo() {
		
		
		
		
		
		
		
		
		
		return"demo/demoResult";
	}
	
	

}
