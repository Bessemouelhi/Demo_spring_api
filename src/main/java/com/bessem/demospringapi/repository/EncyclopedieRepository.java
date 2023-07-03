package com.bessem.demospringapi.repository;

import com.bessem.demospringapi.model.Encyclopedie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncyclopedieRepository extends JpaRepository<Encyclopedie, Long> {
}
