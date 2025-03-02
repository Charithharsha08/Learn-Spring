package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.PlaceOrderDTO;

import lk.ijse_13.Spring_Boot.entity.Customer;
import lk.ijse_13.Spring_Boot.entity.Item;
import lk.ijse_13.Spring_Boot.entity.OrderDetail;
import lk.ijse_13.Spring_Boot.entity.Orders;
import lk.ijse_13.Spring_Boot.repo.ItemRepo;
import lk.ijse_13.Spring_Boot.repo.OrderDetailRepo;
import lk.ijse_13.Spring_Boot.repo.OrderRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service

public class PlaceOrderServiceImpl implements PlaceOrderService {

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderDetailRepo orderDetailRepo;
    @Autowired
    private ItemRepo itemRepo;

   // @Transactional
    @Override
    public void placeOrder(PlaceOrderDTO placeOrderDTO) {
       /* System.out.println(placeOrderDTO.getCustomerDTO().getId());
       orderDetailRepo.save(new OrderDetail(placeOrderDTO.getOid(),placeOrderDTO.getQty(),placeOrderDTO.getTotal(),modelMapper.map(placeOrderDTO.getCustomerDTO(), Customer.class),modelMapper.map(placeOrderDTO.getItemDTO(), Item.class)));

        orderRepo.save(new Orders(placeOrderDTO.getOid(),new Date(System.currentTimeMillis()),placeOrderDTO.getTotal()));

        Item item = itemRepo.findById(placeOrderDTO.getItemDTO().getId()).get();
        item.setQty(item.getQty()-placeOrderDTO.getQty());
        itemRepo.save(item);*/

    }
}

