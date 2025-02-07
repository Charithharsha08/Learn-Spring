package lk.ijse.controller;

import lk.ijse.DTO.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    List<CustomerDTO> customerDTOList = new ArrayList<>();
    @GetMapping("getAll")
    public List<CustomerDTO> getAllCustomers(){
        for (CustomerDTO customerDTO : customerDTOList) {
            System.out.println(customerDTO);
        }
        return customerDTOList;
    }
    @PostMapping("save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerDTOList.add(customerDTO);
        for (CustomerDTO customerDTO1 : customerDTOList) {
            System.out.println(customerDTO1.toString());
        }
        return customerDTO;
    }
    @PutMapping("update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        for (CustomerDTO customerDTO1 : customerDTOList) {
            if (customerDTO1.getId().equals(customerDTO.getId())) {
                customerDTO1.setFirstName(customerDTO.getFirstName());
                customerDTO1.setLastName(customerDTO.getLastName());
                customerDTO1.setAge(customerDTO.getAge());
            }
        }
        return customerDTO;
    }
    @DeleteMapping(path = "delete{id}")
    public String deleteCustomer( @PathVariable("id") String id){
        for (CustomerDTO customerDTO2 : customerDTOList) {
            if (customerDTO2.getId().equals(id)) {
                customerDTOList.remove(customerDTO2);
            }
        }
        return id;

    }
}
