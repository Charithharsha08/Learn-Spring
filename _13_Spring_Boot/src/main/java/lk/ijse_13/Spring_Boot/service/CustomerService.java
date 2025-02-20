package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.CustomerDTO;
import lk.ijse_13.Spring_Boot.entity.Customer;
import lk.ijse_13.Spring_Boot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public boolean saveCustomer(CustomerDTO customerDTO){
        System.out.println("Service layer : "+customerDTO.getId()+" "+customerDTO.getName()+" "+customerDTO.getAge());
        customerRepo.save(new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress(),
                customerDTO.getAge()));
        return true;
    }
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }
    public boolean deleteCustomer(int id){
        customerRepo.deleteById(id);
        return true;
    }
    public boolean updateCustomer(CustomerDTO customerDTO){
        customerRepo.save(new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress(),
                customerDTO.getAge()));
        return true;
    }
}
