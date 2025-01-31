package com.customer.service.mappers;

import com.customer.service.domain.Customer;
import com.customer.service.dto.CustomerDto;

public class CustomerMapper {

    public static CustomerDto customerEntityToCustomerDto(Customer customerEntity) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustId(customerEntity.getCustId());
        customerDto.setName(customerEntity.getName());
        customerDto.setAddress(customerEntity.getAddress());
        customerDto.setPhone(customerEntity.getPhone());
        customerDto.setEmail(customerEntity.getEmail());
        return customerDto;
    }

    public static Customer customerDtoToCustomerEntity(CustomerDto customerDto) {
        Customer customerEntity = new Customer();
        customerEntity.setCustId(customerDto.getCustId());
        customerEntity.setName(customerDto.getName());
        customerEntity.setAddress(customerDto.getAddress());
        customerEntity.setPhone(customerDto.getPhone());
        customerEntity.setEmail(customerDto.getEmail());
        return customerEntity;
    }

}
