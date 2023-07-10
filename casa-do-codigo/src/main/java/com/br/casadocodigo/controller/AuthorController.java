package com.br.casadocodigo.controller;

import com.br.casadocodigo.dto.author.AuthorRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @PostMapping
    public ResponseEntity<?> create(@RequestBody AuthorRequest authorRequest) {
        return ResponseEntity.ok("");
    }

}
