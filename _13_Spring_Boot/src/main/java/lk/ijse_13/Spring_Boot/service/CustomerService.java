package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.CustomerDTO;
import lk.ijse_13.Spring_Boot.entity.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    List<Customer> getAllCustomers();
    void deleteCustomer(int id);
    void updateCustomer(CustomerDTO customerDTO);
}
