package edu.mum.finalexam.service;

import edu.mum.finalexam.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getCustomers();

    Customer createCustomer(Customer customer) throws Exception;

    List<Customer> getPrimeCustomers();

}
