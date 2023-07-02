package com.bessem.demospringapi.repository;

import com.bessem.demospringapi.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
