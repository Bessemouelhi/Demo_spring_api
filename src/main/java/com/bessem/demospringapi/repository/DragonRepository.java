package com.bessem.demospringapi.repository;

import com.bessem.demospringapi.model.Dragon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DragonRepository extends JpaRepository<Dragon, Long> {
}
