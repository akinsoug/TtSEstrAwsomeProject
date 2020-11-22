package com.tts.EstAwsomeProject.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.EstAwsomeProject.Domain.Subscriber;

@RestController
//@Controller
public class MainController implements ErrorController {

	// this a default path
//	@RequestMapping("/")
//	public String home() {
//		return "Hello World!   ddddddd";
//	}

	// This code bellow is for error handling. The class should implement
	// ErrorController =========================================
	// interface
	private static final String PATH = "/error";

	@Override
	// this is for the browser to render a better page not found message
	public String getErrorPath() {
		return PATH;
	}

	// Now the application will return this message when the browser return error
	@RequestMapping(value = "/error")
	public String error() {
		return "Error handling";
	}
	// The code above is for error handling. The class should implement
	// ErrorController =========================================

	

	// this another default path
	@GetMapping(value = "/home")
	public String index(Subscriber subscriber) {
		return "Default Path Rest API Home";
	}

//	private Subscriber subscriber;
//
//	@PostMapping(value = "/")
//	public String addNewSubscriber(Subscriber subscriber, Model model) {
//		subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
//				subscriber.getUserName(), subscriber.getSignedUp()));
//		model.addAttribute("firstName", subscriber.getFirstName());
//		model.addAttribute("lastName", subscriber.getLastName());
//		model.addAttribute("userName", subscriber.getUserName());
//		return "subscriber/result";
//	}// addNewSubscriber

}