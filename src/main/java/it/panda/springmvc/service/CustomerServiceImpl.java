package it.panda.springmvc.service;

import it.panda.springmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Customer> getCustomers() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer get(Long id) {
        return null;
    }
}
