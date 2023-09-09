package com.webflux.Springwebfluxcrud.repository;

import com.webflux.Springwebfluxcrud.model.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepo extends ReactiveCrudRepository<Customer, Integer> {

}
