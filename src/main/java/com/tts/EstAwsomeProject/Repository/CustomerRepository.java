package com.tts.EstAwsomeProject.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.EstAwsomeProject.Domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> { 

    List<Customer> findByLastName(String lastName);
}
