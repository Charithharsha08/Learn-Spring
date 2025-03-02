package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.ItemDTO;
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

    @Transactional
    @Override
    public void placeOrder(PlaceOrderDTO placeOrderDTO) {

        double total = 0.0;
        for (ItemDTO itemDTO : placeOrderDTO.getItemDTOS()) {
            total += itemDTO.getQty() * itemDTO.getPrice();
        }
        //save data to order table
        Orders orders = new Orders();
        orders.setDate(new Date(System.currentTimeMillis()));
        orders.setTotal(total);
        orders.setCustomer(modelMapper.map(placeOrderDTO.getCustomerDTO(), Customer.class));
        orderRepo.save(orders);

        //save data to order detail table
        for (ItemDTO itemDTO : placeOrderDTO.getItemDTOS()) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrders(orders);
            orderDetail.setItem(modelMapper.map(itemDTO, Item.class));
            orderDetail.setQty(itemDTO.getQty());
            orderDetailRepo.save(orderDetail);
        }
        //update qty in item table
        for (ItemDTO itemDTO : placeOrderDTO.getItemDTOS()) {
            Item item = itemRepo.findById(itemDTO.getItemId()).get();
            item.setQty(item.getQty() - itemDTO.getQty());
            itemRepo.save(item);
        }
    }

}

