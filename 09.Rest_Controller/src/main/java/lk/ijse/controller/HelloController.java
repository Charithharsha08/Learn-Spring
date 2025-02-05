package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("Hello Controller Created");
    }
    @GetMapping
    public String sayHello(){
        return "hello World";
    }

    @PutMapping
    public String sayPut(){
        return "Put Method";
    }
    @DeleteMapping
    public String sayDelete(){
        return "Delete Method";
    }

}
