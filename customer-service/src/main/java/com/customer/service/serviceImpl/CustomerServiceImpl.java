package com.customer.service.serviceImpl;

import com.customer.service.domain.Customer;
import com.customer.service.dto.CustomerDto;
import com.customer.service.mappers.CustomerMapper;
import com.customer.service.repository.CustomerRepo;
import com.customer.service.service.CustomerService;
import com.customer.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public ResponseEntity<Response> getCustomerById(int custId) {
        Optional<Customer> customerEntity = customerRepo.findById(custId);
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body(CustomerMapper.customerEntityToCustomerDto(customerEntity.get()).toString())
                .exception("null")
                .build());
    }

    @Override
    public ResponseEntity<Response> insertCustomer(CustomerDto customerDto) {
        Customer customerEntity = customerRepo.save(CustomerMapper.customerDtoToCustomerEntity(customerDto));
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body(CustomerMapper.customerEntityToCustomerDto(customerEntity).toString())
                .exception("null")
                .build());
    }

    @Override
    public ResponseEntity<Response> updateCustomer(CustomerDto customerDto) {
        Customer customerEntity = customerRepo.save(CustomerMapper.customerDtoToCustomerEntity(customerDto));
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body(CustomerMapper.customerEntityToCustomerDto(customerEntity).toString())
                .exception("null")
                .build());
    }

    @Override
    public ResponseEntity<Response> deleteCustomer(int custId) {
       customerRepo.deleteById(custId);
       return ResponseEntity.ok(Response.builder()
               .status(HttpStatus.OK)
               .body("true")
               .exception("null")
               .build());
    }
}
