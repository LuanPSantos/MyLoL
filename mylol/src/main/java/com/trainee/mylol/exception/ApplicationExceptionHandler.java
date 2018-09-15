package com.trainee.mylol.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Luan
 */
@ControllerAdvice
public class ApplicationExceptionHandler {
    
     @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
     @ExceptionHandler(value = Exception.class)
     public ApplicationException onException(Exception exception){
         ApplicationException applicationException = new ApplicationException();
         applicationException.setMessage(exception.getMessage());
         
         return applicationException;
     }
}
