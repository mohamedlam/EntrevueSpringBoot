package com.example.entrevueSpringBoot.data.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Film{

    @Id  @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String titre;

    private String description;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Acteur> acteurs = new ArrayList<>();

}
