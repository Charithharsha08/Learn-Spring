package lk.ijse._17_spring_boot_login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    //Trace,Debug,Info,Warn,Error
    private static final Logger log = LoggerFactory.getLogger(DemoController.class);


    @GetMapping("log-demo")
    public String logDemo(){
        log.trace("This is a trace message");
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return "log-demo";

    }
}
