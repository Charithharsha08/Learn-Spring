package lk.ijse_13.Spring_Boot.advicer;

import lk.ijse_13.Spring_Boot.util.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtil exceptionHandler(Exception exception ){
        return new ResponseUtil(500,exception.getMessage(),null);
    }
}
