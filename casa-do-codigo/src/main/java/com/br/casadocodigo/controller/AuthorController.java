package com.br.casadocodigo.controller;

import com.br.casadocodigo.dto.author.AuthorRequest;
import com.br.casadocodigo.model.Author;
import com.br.casadocodigo.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @PostMapping
    public ResponseEntity<?> create(@RequestBody AuthorRequest authorRequest) {
        Author author = authorService.create();
        return ResponseEntity.ok(author);
    }

}
