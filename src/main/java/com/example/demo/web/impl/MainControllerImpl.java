package com.example.demo.web.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MainConstants;
import com.example.demo.web.MainController;

@RestController
@RequestMapping(value=MainConstants.HOME)
public class MainControllerImpl implements MainController {

	@Override
	@RequestMapping(value=MainConstants.FIRST)
	public String firstRequest() {
		System.out.println("this is from firstRequest...");
		return null;
	}

}
