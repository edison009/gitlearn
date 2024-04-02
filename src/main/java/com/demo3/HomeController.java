package com.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String hello()
	{
<<<<<<< HEAD
		System.out.println("COmes Here first online commit merge conflict two");
=======
		System.out.println("COmes Here first online commit merge conflict one");
>>>>>>> 7825c25 (merge one)
		return "hello";
	}

}
