package lk.ijse._14_spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloController {
    @GetMapping
    public String hello(HttpServletRequest request) {
        return "Hello Spring Security" + request.getSession().getId();
    }
}
