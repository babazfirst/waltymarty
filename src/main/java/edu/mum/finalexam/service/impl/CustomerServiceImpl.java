package edu.mum.finalexam.service.impl;

import edu.mum.finalexam.model.Customer;
import edu.mum.finalexam.repository.CustomerRepository;
import edu.mum.finalexam.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll().stream().sorted().collect(Collectors.toList());
    }

    @Override
    public Customer createCustomer(Customer customer) throws Exception {
        Customer customerEntity = customerRepository.findByCustomerNumber(customer.getCustomerNumber());
        if(customerEntity != null) {
            throw new Exception("Customer already registered.");
        }
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getPrimeCustomers() {
        return customerRepository.findByIsPrime(true).stream().sorted().collect(Collectors.toList());
    }


}
