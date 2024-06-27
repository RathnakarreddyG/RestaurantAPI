package com.rms.grr.exceptionHandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.UUID;

@Slf4j
@RestControllerAdvice
public class  ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = CommonException.class)
    public ResponseEntity<?> commonException(CommonException exception){
        ErrorResponse  errorResponse = getResponse(exception, HttpStatus.CONFLICT.toString());
        return new ResponseEntity<>(errorResponse,HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = OrderException.class)
    public ResponseEntity<?> handleOrderException(OrderException orderException){
        ErrorResponse  errorResponse = getResponse(orderException, HttpStatus.BAD_REQUEST.toString());
        logger.error("Order not found "+errorResponse.getGuid());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = BranchException.class)
    public ResponseEntity<?> handleBranchException(BranchException branchException){
        ErrorResponse  errorResponse = getResponse(branchException, HttpStatus.BAD_REQUEST.toString());
        logger.error("Branch not found "+errorResponse.getGuid());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    public ErrorResponse getResponse(Exception exception, String statusCode){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setGuid(UUID.randomUUID().toString());
        errorResponse.setError_message(exception.getMessage());
        errorResponse.setStatus_code(statusCode);
        errorResponse.setTime_stamp(new Date());
        return errorResponse;
    }

}
