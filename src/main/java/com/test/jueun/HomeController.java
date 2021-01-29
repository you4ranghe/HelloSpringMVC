package com.test.jueun;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//	private BeanTest test = new BeanTest();
	//이렇게 사용 하지않고 프레임워크에서 관리 ioc 제어의 역전
	@Autowired
	@Qualifier("test2") //bean의 id값을 찾아주는 @Qualifier 분류하다
	//지금은 servlet-context.xml에 bean 등록해두고 테스트 함
	private BeanTest test;
	
	@Autowired
	@Qualifier("test3")
	private BeanTest test2;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		System.out.println("beanTest출력하기 :  "+test.getName());
		System.out.println("생성자를 통한 beanTest : " +test2.getName());
		
		return "index";
	}
	
}
