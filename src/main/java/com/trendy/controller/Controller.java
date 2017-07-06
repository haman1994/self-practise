package com.trendy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }
	
	 @RequestMapping("/test")
	    public String testController(){
	    	return "this is test page!";
	}
    
   
}
