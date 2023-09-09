package com.webflux.Springwebfluxcrud.service;

import com.webflux.Springwebfluxcrud.model.Customer;
import com.webflux.Springwebfluxcrud.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor      //default constructor
public class CustomerService {

    private final CustomerRepo customerRepo;

    public Mono<Customer> save(Customer customer){
       return customerRepo.save(customer);
    }
    public Flux<Customer> findAll(){
        return customerRepo.findAll();
    }

    public Mono<Customer> findById(Integer id){
        return  customerRepo.findById(id);
    }

    public Mono<Customer> updateCustomer(int id, Customer customer) {
        return customerRepo.save(customer);
    }

    public Mono<Void> deleteById(int id) {
        return  customerRepo.deleteById(id).then();
    }


}
