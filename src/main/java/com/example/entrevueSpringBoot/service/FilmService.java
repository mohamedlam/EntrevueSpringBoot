package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.data.entities.Film;
import com.example.entrevueSpringBoot.data.repositories.FilmRepository;
import com.example.entrevueSpringBoot.exception.FilmNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Film create(Film film) {
        return filmRepository.save(film);
    }

    public Film getById(long id) {
        Optional<Film> filmOptional = filmRepository.findById(id);
        if (!filmOptional.isPresent())
            throw new FilmNotFoundException();
        return filmOptional.get();

    }

}
