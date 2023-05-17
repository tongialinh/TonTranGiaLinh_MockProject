package com.r2s.TonTranGiaLinh_MockProject.repository;

import com.r2s.TonTranGiaLinh_MockProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
