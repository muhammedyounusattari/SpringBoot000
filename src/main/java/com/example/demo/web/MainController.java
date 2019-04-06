package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MainConstants;

//@RestController
//@RequestMapping(value=MainConstants.HOME)
public interface MainController {

//	@RequestMapping(value=MainConstants.FIRST)
	public String firstRequest();
}
