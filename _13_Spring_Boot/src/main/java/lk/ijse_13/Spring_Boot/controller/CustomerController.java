package lk.ijse_13.Spring_Boot.controller;

import lk.ijse_13.Spring_Boot.DTO.CustomerDTO;
import lk.ijse_13.Spring_Boot.entity.Customer;
import lk.ijse_13.Spring_Boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin(origins = "*")

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping(path = "save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
       boolean result = customerService.saveCustomer(customerDTO);
       return result ? "Success" : "Failed";
    }

    @GetMapping(path = "getAll")
    public List<Customer> getAllCustomers(){
        List<Customer> customerList = customerService.getAllCustomers();

        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        return customerList;
    }
    @DeleteMapping(path = "delete", params = "id")
    public String deleteCustomer( @RequestParam("id") int id) {
        boolean result = customerService.deleteCustomer(id);
        return result ? "Success" : "Failed";
    }

    @PutMapping(path = "update")
    public String updateCustomer(@RequestBody CustomerDTO customerDTO){
        boolean result = customerService.updateCustomer(customerDTO);
        return result ? "Success" : "Failed";
    }
}
