package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class WildCardMappingOptionTwo {
    // this type is not support
    //@GetMapping("test/**/hello")
    public String test1(){
        return "get mapping option two";
    }
}
