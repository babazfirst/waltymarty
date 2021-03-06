package edu.mum.finalexam.controller;

import edu.mum.finalexam.model.Customer;
import edu.mum.finalexam.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCustomerList() {
        List<Customer> customerList = customerService.getCustomers();
        return "index";
    }

    @RequestMapping(value = "/prime", method = RequestMethod.GET)
    public String getPrimeCustomerList() {
        List<Customer> customerList = customerService.getPrimeCustomers();
        return "index";
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addCustomer(@RequestBody Customer customer) throws Exception {
        Customer result = customerService.createCustomer(customer);
        return "index";
    }


}
