package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("Hello Controller Created");
    }
    @GetMapping
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("bye")
    public String sayBye(){
        return "Bye World";
    }
}
