package com.br.casadocodigo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @PostMapping
    public ResponseEntity<?> create() {
        return ResponseEntity.created(URI.create("in progress...")).build();
    }

}
