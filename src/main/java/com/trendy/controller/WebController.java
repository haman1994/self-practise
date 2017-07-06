package com.trendy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WebController {
	
	@RequestMapping("/")
	@ResponseBody
    public String greeting(Model model) {
		System.out.println("greeting!");
        return "welcome";
    }
	
	@RequestMapping("/test")
	public String testController(){
	    	return "this is test page!";
	}
	
	@RequestMapping("/login")
	public String loginController(){
	    	return "this is login page!";
	}
    
   
}
