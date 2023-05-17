package com.r2s.TonTranGiaLinh_MockProject.repository;

import com.r2s.TonTranGiaLinh_MockProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
