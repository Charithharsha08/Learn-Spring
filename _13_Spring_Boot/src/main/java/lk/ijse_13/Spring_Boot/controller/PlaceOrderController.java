package lk.ijse_13.Spring_Boot.controller;

import lk.ijse_13.Spring_Boot.DTO.PlaceOrderDTO;
import lk.ijse_13.Spring_Boot.service.PlaceOrderService;
import lk.ijse_13.Spring_Boot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/placeorder")
@CrossOrigin(origins = "*")

public class PlaceOrderController {

    @Autowired
    private PlaceOrderService placeOrderService;


@PostMapping(path = "save")
public ResponseUtil savePlaceOrder(@RequestBody PlaceOrderDTO placeOrderDTO) {
    placeOrderService.placeOrder(placeOrderDTO);
    return new  ResponseUtil(200, "PlaceOrder Saved", null);
}

}
