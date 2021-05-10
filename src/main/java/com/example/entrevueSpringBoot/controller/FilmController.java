package com.example.entrevueSpringBoot.controller;


import com.example.entrevueSpringBoot.data.entities.Film;
import com.example.entrevueSpringBoot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/film")
public class FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/{id}")
    ResponseEntity<Film> getById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(filmService.getById(id));
    }


    @PostMapping()
    public ResponseEntity create(@RequestBody Film film) {
        return ResponseEntity.status(HttpStatus.CREATED).body(filmService.create(film));
    }

}
