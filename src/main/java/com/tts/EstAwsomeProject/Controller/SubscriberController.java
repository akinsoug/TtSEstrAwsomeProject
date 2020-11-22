package com.tts.EstAwsomeProject.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tts.EstAwsomeProject.Domain.Subscriber;
import com.tts.EstAwsomeProject.Repository.SubscriberRepository;

//@RestController  // this is to render an json object
@Controller // to just render an html page 
public class SubscriberController {
	
	@Autowired
	private SubscriberRepository subscriberRepository;
	
	private Subscriber subscriber;
	
	/** 
	 * 
	 * @param subscriber
	 * @return
	 */
	@GetMapping(value="/subscriberindex")
    public String index(Subscriber subscriber) {
		return "subscriber/index";
	//Where we want to go when our application is started 
    }
	
	/**
	 * 
	 * @param subscriber
	 * @param model
	 * @return
	 */
	@PostMapping(value = "/subscriberresult")
	public String addNewSubscriber(Subscriber subscriber, Model model) { 
		subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
												 subscriber.getUserName(),subscriber.getGender(), 
												 subscriber.getNote(), subscriber.getProfecsion(),  subscriber.getSignedUp()));
		model.addAttribute("firstName", subscriber.getFirstName());
		model.addAttribute("lastName", subscriber.getLastName());
		model.addAttribute("userName", subscriber.getUserName());
		model.addAttribute("username", subscriber.getUserName());
		model.addAttribute("gender", subscriber.getGender());
		model.addAttribute("id", subscriber.getId());
		model.addAttribute("profecsion", subscriber.getProfecsion());
		model.addAttribute("note", subscriber.getNote());
		System.out.println(subscriber);
		return "subscriber/result";
	}// addNewSubscriber
	
	
	

//	-------------------------------------------------------------------------------------------------
	@GetMapping(value="/subscribpage")
    public String IndexNewFilex(Subscriber subscriber) {
		return "IndexNewFile";
    }
	
//	/**
//	 * @return
//	 */
//	@RequestMapping(value="/subscribpageSuccess", method = RequestMethod.POST)
//    public String addSubscrib(@ModelAttribute("subcriber")Subscriber subscriber) {
//		
//		return "IndexNewFileResult"; 
//    }	
	
	@PostMapping(value="/subscribpageSuccess")
    public String addSubscribPost(@ModelAttribute("subcriber")Subscriber subscriber) {
		subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
				 subscriber.getUserName(), subscriber.getSignedUp()));
//model.addAttribute("firstName", subscriber.getFirstName());
//model.addAttribute("lastName", subscriber.getLastName());
//model.addAttribute("userName", subscriber.getUserName());
//model.addAttribute("id", subscriber.getId());
		System.out.println(subscriber);
		return "IndexNewFileResult";
    }


//	-------------------------------------------------------------------------------------------------
	
	

}

























