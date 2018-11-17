package edu.mum.finalexam.controller;

import edu.mum.finalexam.model.Customer;
import edu.mum.finalexam.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


}
