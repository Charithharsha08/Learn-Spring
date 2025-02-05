package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prams")
public class PramsController {
    @GetMapping(params = {"id"})
    public String text1(@RequestParam(value = "id",required = false) String id){
        return id;
    }
    @GetMapping(params = {"id","name"})
    public String text2(@RequestParam(value = "id") String id,@RequestParam(value = "name") String name){
        return id+" "+name;
    }
}
