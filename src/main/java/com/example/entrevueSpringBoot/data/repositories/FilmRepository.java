package com.example.entrevueSpringBoot.data.repositories;


import com.example.entrevueSpringBoot.data.entities.Film;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FilmRepository extends JpaRepository<Film, Long> {
}
