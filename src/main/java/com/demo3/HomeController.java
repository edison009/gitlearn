package com.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String hello()
	{
		System.out.println("COmes Here first online commit");
		return "hello";
	}

}
