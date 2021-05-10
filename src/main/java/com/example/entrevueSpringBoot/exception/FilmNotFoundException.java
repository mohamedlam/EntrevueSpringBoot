package com.example.entrevueSpringBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Film not found")
public class FilmNotFoundException extends RuntimeException {
}
