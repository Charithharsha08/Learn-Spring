package lk.ijse.controller;

import lk.ijse.DTO.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {
    /*@PostMapping
    public String text1(@RequestParam(value = "id") String id,
                        @RequestParam(value = "name") String name){
        return id +" "+name;
    }*/

    @PostMapping
    public String text2(@ModelAttribute CustomerDTO customerDTO){
        return customerDTO.toString();

    }

}
