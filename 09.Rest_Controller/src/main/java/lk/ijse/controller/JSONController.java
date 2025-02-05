package lk.ijse.controller;

import lk.ijse.DTO.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "json")
public class JSONController {
    @PostMapping
    public String text1(@RequestBody CustomerDTO customerDTO){
        return customerDTO.getFirstName();

    }
   /* @GetMapping
    public CustomerDTO text2(){
        return new CustomerDTO("A", "B", 20);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO text3(){
        return new CustomerDTO("Aaa", "Bbb", 20);
    }*/

    @GetMapping(path = ("data"), produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> text4(){
        ArrayList<CustomerDTO> list = new ArrayList<>();

        CustomerDTO dto = new CustomerDTO("Aaa", "Bbb", 20);
        list.add(dto);
        CustomerDTO dto1 = new CustomerDTO("Aaavv", "Bbbsasas", 210);
        list.add(dto1);
        return list;

    }
}
