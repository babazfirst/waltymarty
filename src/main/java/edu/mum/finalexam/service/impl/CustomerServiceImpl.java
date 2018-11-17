package edu.mum.finalexam.service.impl;

import edu.mum.finalexam.model.Customer;
import edu.mum.finalexam.repository.CustomerRepository;
import edu.mum.finalexam.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

}
