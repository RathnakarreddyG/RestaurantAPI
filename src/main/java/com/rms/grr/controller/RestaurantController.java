package com.rms.grr.controller;

import com.rms.grr.RestaurantDTO;
import com.rms.grr.exceptionHandler.CommonException;
import com.rms.grr.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;


    @PostMapping("/")
    public ResponseEntity<?> createRestaurant(@RequestBody RestaurantDTO restaurantDTO) throws CommonException {
        return restaurantService.createRestaurant(restaurantDTO);
    }




}
