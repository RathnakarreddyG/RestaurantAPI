package com.rms.grr.controller;

import com.rms.grr.exceptionHandler.OrderException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/{orderId}")
    public ResponseEntity<?> getOrder(@PathVariable Long orderId){

        if(orderId == 101){
            throw new OrderException("Order not found");
        }
        return new ResponseEntity<>("Order found for "+orderId, HttpStatus.OK);
    }

}
