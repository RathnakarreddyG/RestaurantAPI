package com.rms.grr.repository;

import com.rms.grr.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersDao extends JpaRepository<Orders, Long> {
}
