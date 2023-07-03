package com.bessem.demospringapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DRAGON")
@Getter
@Setter
@NoArgsConstructor
public class Dragon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_dragon;

    @Column(length = 30)
    private String name;

    private int genre_dragon;

    private int lvl_dragon;
}
