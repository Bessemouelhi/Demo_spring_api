package com.bessem.demospringapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ENCYCLOPEDIE")
@Getter
@Setter
@NoArgsConstructor
public class Encyclopedie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_encyclopedie;

    @Column(length = 20)
    private String titre;

    private String contenu;

    private int id_espece;
}
