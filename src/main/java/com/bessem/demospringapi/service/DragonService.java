package com.bessem.demospringapi.service;

import com.bessem.demospringapi.model.Dragon;

import java.util.List;

public interface DragonService {
    Dragon creer(Dragon dragon);

    List<Dragon> lire();

    Dragon modifier(Long id, Dragon dragon);

    String supprimer(Long id);
}
