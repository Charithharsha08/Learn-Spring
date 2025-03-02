package lk.ijse_13.Spring_Boot.controller;

import lk.ijse_13.Spring_Boot.DTO.CustomerDTO;
import lk.ijse_13.Spring_Boot.entity.Customer;
import lk.ijse_13.Spring_Boot.service.CustomerService;
import lk.ijse_13.Spring_Boot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin(origins = "*")

public class CustomerController {
    @Autowired
    private CustomerService  customerService ;
    @PostMapping(path = "save")
    public ResponseUtil saveCustomer(@RequestBody CustomerDTO customerDTO) {
          customerService.saveCustomer(customerDTO);
            return new ResponseUtil(200, "Customer Saved", null);
    }

    @GetMapping(path = "getAll")
    public ResponseUtil getAllCustomers(){
        List<Customer> customerList = customerService.getAllCustomers();
        return new ResponseUtil(200, "Success", customerList);
    }

    @DeleteMapping(path = "delete", params = "id")
    public ResponseUtil deleteCustomer( @RequestParam("id") int id) {
        customerService.deleteCustomer(id);
            return new ResponseUtil(200, "Customer Deleted", null);
    }

    @PutMapping(path = "update")
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println("Customer Controller" + customerDTO.getCustomerId());
         customerService.updateCustomer(customerDTO);
            return new ResponseUtil(200, "Customer Updated", null);
        }
}
