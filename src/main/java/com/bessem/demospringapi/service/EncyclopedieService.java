package com.bessem.demospringapi.service;

import com.bessem.demospringapi.model.Encyclopedie;

import java.util.List;

public interface EncyclopedieService {
    Encyclopedie creer(Encyclopedie encyclopedie);

    List<Encyclopedie> lire();

    Encyclopedie modifier(Long id, Encyclopedie encyclopedie);

    String supprimer(Long id);
}
