package com.mdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mdc.dto.TestDTO;
import com.mdc.service.TestService;


@Controller
public class TestController {
	
	@Autowired
	TestService service;
	
	@GetMapping("/as")
    public String hello() {
        return "index";
    }

	@RequestMapping("/")
	public ModelAndView SelectAllFromUser() {
		ModelAndView mav = new ModelAndView("test");
		List<TestDTO> userList = service.testList();
		mav.addObject("list",userList);
		return mav;
	}

}