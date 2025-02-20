package lk.ijse.controller;

import lk.ijse.DTO.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin(origins = "*") // Allow all origins
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
                customerDTO1.setName(customerDTO.getName());
                customerDTO1.setAddress(customerDTO.getAddress());
                customerDTO1.setAge(customerDTO.getAge());
            }
        }
        return customerDTO;
    }
    @DeleteMapping(path = "delete", params = "id")
    public String deleteCustomer( @RequestParam("id") String id) {
        System.out.println(id);
        Iterator<CustomerDTO> iterator = customerDTOList.iterator();
        while (iterator.hasNext()) {
            CustomerDTO customer = iterator.next();
            if (customer.getId().equals(id)) {
                iterator.remove(); // ✅ Correct way to remove an item while iterating
            }
        }
        return id;
    }

}
