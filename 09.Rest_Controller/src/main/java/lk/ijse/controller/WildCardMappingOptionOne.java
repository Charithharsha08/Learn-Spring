package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class WildCardMappingOptionOne {
    @GetMapping("test/*/hello")
    public String test1(){
        return "get mapping option one";
    }

    @GetMapping("test/*/*")
    public String test2(){
        return "get mapping option two";
    }
}
