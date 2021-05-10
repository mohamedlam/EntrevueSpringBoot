package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.data.entities.Film;
import com.example.entrevueSpringBoot.data.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public  FilmService(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    public Film create(Film film){
        return filmRepository.save(film);
    }

    public Film getById(long id){
        return filmRepository.findById(id).orElseGet(Film::new);

    }

}
