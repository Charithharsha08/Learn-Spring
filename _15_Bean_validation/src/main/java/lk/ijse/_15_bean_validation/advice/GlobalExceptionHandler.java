package lk.ijse._15_bean_validation.advice;

import lk.ijse._15_bean_validation.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
   public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidation(MethodArgumentNotValidException exception){
        Map<String ,String> errors = new HashMap<>();
        for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
            errors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        ResponseDTO responseDTO = new ResponseDTO("Validation Error", HttpStatus.BAD_REQUEST.value(),errors);
        return new ResponseEntity<>(responseDTO,HttpStatus.BAD_REQUEST);
    }
}
