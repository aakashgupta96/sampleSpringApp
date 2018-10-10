package com.walmart.school.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/getAllTopics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic(1,"chem","headache"),new Topic(2,"phy","awesome"));
	}
	
	@RequestMapping("/sayhello")
	public String sayHello() {
		return "hello mere bhai";
	}
	
//	@RequestMapping("/error")
//	public String error() {
//		return "Error message";
//	}

}
