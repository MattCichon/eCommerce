package com.matt.juice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.matt.juice.model.Subscriber;
import com.matt.juice.repository.SubscriberRepository;

@Controller
public class SubscriberController {

	@Autowired
	private SubscriberRepository subscriberRepository;
	

	
	@GetMapping(value = "/contact")
	public String contact(Subscriber subscriber) {
		return "contact";
	}
	
	@PostMapping(value = "/contact")
	public String addNewSubscriber(Subscriber subscriber, Model model) {
		subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
				subscriber.getUserEmail(), subscriber.getUserName(), subscriber.getSignedUp()));
		model.addAttribute("firstName", subscriber.getFirstName());
		model.addAttribute("lastName", subscriber.getLastName());
		model.addAttribute("userEmail", subscriber.getUserEmail());
		model.addAttribute("userName", subscriber.getUserName());
		return "contactUs";
	}
	
	
}
