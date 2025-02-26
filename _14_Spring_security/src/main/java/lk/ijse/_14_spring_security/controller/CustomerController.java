package lk.ijse._14_spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import lk.ijse._14_spring_security.Customer;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private List<Customer> customers = new ArrayList<>(
            List.of(
                    new Customer(1,"chaeith"),
            new Customer(2,"Dinuka")
    ));

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customers;
    }

    @PostMapping
    public String saveCustomer(Customer customer){
        customers.add(customer);
        return "Customer Saved";
    }
    @GetMapping(path = "csrftoken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");}
}
