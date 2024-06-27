package com.rms.grr.repository;

import com.rms.grr.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Restaurant Repository
 * @author Ratnakar Reddy
 * @apiNote
 */
public interface RestaurantDao extends JpaRepository<Restaurant, Long> {

    Optional<Restaurant> findByName(String name);
}
