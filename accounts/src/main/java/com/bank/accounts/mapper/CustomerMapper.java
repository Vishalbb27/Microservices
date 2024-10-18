package com.bank.accounts.mapper;

import com.bank.accounts.dto.CustomerDto;
import com.bank.accounts.entity.Customer;

public class CustomerMapper {
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer){
        customer.setEmail(customerDto.getEmail());
        customer.setName(customerDto.getName());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
    public static CustomerDto mapToCustomerDto(Customer customer,CustomerDto customerDto){
        customerDto.setEmail(customer.getEmail());
        customerDto.setName(customer.getName());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }
}
