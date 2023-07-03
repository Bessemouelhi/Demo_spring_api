package com.bessem.demospringapi.service;

import com.bessem.demospringapi.model.Encyclopedie;
import com.bessem.demospringapi.repository.EncyclopedieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EncyclopedieServiceImpl implements EncyclopedieService{

    private final EncyclopedieRepository encyclopedieRepository;

    @Override
    public Encyclopedie creer(Encyclopedie encyclopedie) {
        return encyclopedieRepository.save(encyclopedie);
    }

    @Override
    public List<Encyclopedie> lire() {
        return encyclopedieRepository.findAll();
    }

    @Override
    public Encyclopedie modifier(Long id, Encyclopedie encyclopedie) {
        return encyclopedieRepository.findById(id).map(e -> {
            e.setTitre(encyclopedie.getTitre());
            e.setContenu(encyclopedie.getContenu());
            e.setId_espece(encyclopedie.getId_espece());

            return encyclopedieRepository.save(e);
        }).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        encyclopedieRepository.deleteById(id);
        return "Encyclopedie supprimé";
    }
}
