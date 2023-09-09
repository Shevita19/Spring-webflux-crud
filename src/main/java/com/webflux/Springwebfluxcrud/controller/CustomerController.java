package com.webflux.Springwebfluxcrud.controller;

import com.webflux.Springwebfluxcrud.model.Customer;
import com.webflux.Springwebfluxcrud.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api/vi/customers")
@RequiredArgsConstructor
public class CustomerController {

    private  final CustomerService customerService;

    @PostMapping
    Mono<Customer> save(@RequestBody Customer customer){
        return  customerService.save(customer);
    }

    @GetMapping
    Flux<Customer> findAll(){
        return customerService.findAll()
                .delayElements(Duration.ofSeconds(5));
    }

    @GetMapping("/record/{id}")
    public Mono<Customer> findById(@PathVariable("id") Integer id){
        return  customerService.findById(id);

    }

    @PutMapping("update/{id}")
    public Mono<Customer> update(@PathVariable int id, @RequestBody Customer customer){
        return customerService.updateCustomer(id,customer);

    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable ("id") int id){
        return customerService.deleteById(id);
    }

}