package com.jpadatatest.demo.repository;

import com.jpadatatest.demo.entity.GiftBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftRepository extends JpaRepository<GiftBase , Long> {

}
