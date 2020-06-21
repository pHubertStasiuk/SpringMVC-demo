package it.panda.springmvc.controller;

import it.panda.springmvc.model.Customer;
import it.panda.springmvc.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }


    @PostMapping("/save")
    public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            customerService.save(customer);
            return "redirect:/customer/list";
        } else {
            return "customer-form";
        }
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") Long theId) {
        customerService.delete(theId);
        return "redirect:/customer/list";
    }

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List<Customer> theCustomers = customerService.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("customerId") Long theId,
                                    Model model) {
        Customer customer = customerService.get(theId);
        model.addAttribute("customer", customer);
        return "customer-form";
    }
}
