package edu.mum.finalexam.repository;

import edu.mum.finalexam.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByCustomerNumber(String customerNumber);

    List<Customer> findByIsPrime(boolean isPrime);
}
