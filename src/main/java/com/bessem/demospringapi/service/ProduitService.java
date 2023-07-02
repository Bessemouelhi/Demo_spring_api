package com.bessem.demospringapi.service;

import com.bessem.demospringapi.model.Produit;

import java.util.List;

public interface ProduitService {
    Produit creer(Produit produit);

    List<Produit> lire();

    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);
}
