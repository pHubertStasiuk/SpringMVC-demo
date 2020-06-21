package it.panda.springmvc.service;

import it.panda.springmvc.model.Customer;

import java.util.List;

public interface CustomerService {

    void delete(Long id);

    List<Customer> getCustomers();

    void save(Customer customer);

    Customer get(Long id);
}
