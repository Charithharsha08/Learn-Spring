package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.CustomerDTO;
import lk.ijse_13.Spring_Boot.entity.Customer;
import lk.ijse_13.Spring_Boot.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getCustomerId())) {
            throw new RuntimeException("Customer already exists");
        }
        customerRepo.save
                (modelMapper.map(customerDTO, Customer.class));
    }
    @Override
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }
    @Override
    public void deleteCustomer(int id){
        if (!customerRepo.existsById(id)) {
            throw new RuntimeException("Customer does not exist");
        }
        customerRepo.deleteById(id);

    }
    @Override
    public void updateCustomer(CustomerDTO customerDTO){
        if (customerRepo.existsById(customerDTO.getCustomerId())) {
            customerRepo.save(modelMapper.map(customerDTO, Customer.class));
            return;
        }
        throw new RuntimeException("Customer not found");
    }
}
