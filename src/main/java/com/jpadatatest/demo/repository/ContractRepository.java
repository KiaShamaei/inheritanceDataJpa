package com.jpadatatest.demo.repository;

import com.jpadatatest.demo.entity.BaseContract;
import com.jpadatatest.demo.entity.ShilaContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<ShilaContract , Long> {
}
