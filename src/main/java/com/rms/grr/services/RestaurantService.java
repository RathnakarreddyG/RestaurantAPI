package com.rms.grr.services;

import com.rms.grr.RestaurantDTO;
import com.rms.grr.exceptionHandler.CommonException;
import com.rms.grr.exceptionHandler.OrderException;
import com.rms.grr.models.Restaurant;
import com.rms.grr.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantDao restaurantDao;


    public ResponseEntity<?> createRestaurant(RestaurantDTO restaurantDTO) throws CommonException {

        Optional<Restaurant> checkRestaurant = restaurantDao.findByName(restaurantDTO.getName());
        if(checkRestaurant.isPresent()){
            throw new CommonException("Restaurant already present with this name");
        }

//        Restaurant restaurant = new Restaurant(restaurantDTO.getName(), restaurantDTO.getAddress(), false);


        return new ResponseEntity<>("", HttpStatus.CREATED);
    }
}
