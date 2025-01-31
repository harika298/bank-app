package com.customer.service.controller;

import com.customer.service.dto.CustomerDto;
import com.customer.service.service.CustomerService;
import com.customer.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(path ="/getCustomerById/{custId}", produces = "application/json")
    public ResponseEntity<Response> getCustomerById(@PathVariable int custId) {
        return customerService.getCustomerById(custId);
    }

    @PostMapping(path = "/insertCustomer", consumes = "application/json")
    public ResponseEntity<Response> insertCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.insertCustomer(customerDto);

    }

    @PutMapping(path="/updateCustomer", consumes = "application/json")
    public ResponseEntity<Response> updateCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.updateCustomer(customerDto);
    }

    @DeleteMapping(path = "/deleteCustomer")
    public ResponseEntity<Response> deleteCustomer(@PathVariable int custId) {
        return customerService.deleteCustomer(custId);
    }

}
