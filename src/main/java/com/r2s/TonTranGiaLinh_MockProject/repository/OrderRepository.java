package com.r2s.TonTranGiaLinh_MockProject.repository;

import com.r2s.TonTranGiaLinh_MockProject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
