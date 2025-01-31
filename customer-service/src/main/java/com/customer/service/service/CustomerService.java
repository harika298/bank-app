package com.customer.service.service;

import com.customer.service.dto.CustomerDto;
import com.customer.service.util.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public ResponseEntity<Response> getCustomerById(int custId);

    public ResponseEntity<Response> insertCustomer(CustomerDto customerDto);

    public ResponseEntity<Response> updateCustomer(CustomerDto customerDto);

    public ResponseEntity<Response> deleteCustomer(int custId);

}
