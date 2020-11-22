package com.tts.EstAwsomeProject.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.EstAwsomeProject.Domain.Customer;
import com.tts.EstAwsomeProject.Domain.Subscriber;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {
	List<Subscriber> findByLastName(String lastName);
	List<Subscriber> findByFirstName(String firstName);
	List<Subscriber> findByUserName(String firstName);
}