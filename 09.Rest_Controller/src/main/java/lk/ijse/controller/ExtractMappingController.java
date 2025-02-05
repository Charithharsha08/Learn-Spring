package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("extract")
public class ExtractMappingController {
    @GetMapping(path = "test1")
    public String test1(){
        return "test1";
    }

    @GetMapping(path = "test2")
    public String test2(){
        return "test2";
    }
    @GetMapping(path = "test3/example/test4")
    public String test3(){
        return "test3(text3/example/test4)";
    }

}
