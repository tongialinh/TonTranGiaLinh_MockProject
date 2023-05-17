package com.r2s.TonTranGiaLinh_MockProject.repository;

import com.r2s.TonTranGiaLinh_MockProject.entity.CartLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartLineItemRepository extends JpaRepository<CartLineItem,Long> {
}
