package com.walmart.school.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${abc}")
	private String abc;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String sayHello() {
		return "{\"success\":" + abc + "}";
	}

}
