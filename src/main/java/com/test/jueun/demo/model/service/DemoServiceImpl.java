package com.test.jueun.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.jueun.demo.model.dao.DemoDao;

//클래스중 DemoService라는 인터페이스를 가져쓰는 클ㄹ스
//web mvc 패턴에서 service역할을 할때 @Service를 클래스 선언부에 놓는다
//인터페이스는 스프링을 등록하지 않는다.
@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoDao dao;

}
