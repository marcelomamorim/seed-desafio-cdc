package com.br.casadocodigo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping
public class BookController {

    public ResponseEntity<?> create() {
        return ResponseEntity.created(URI.create("in progress...")).build();
    }

    public ResponseEntity<?> getBooks() { return ResponseEntity.ok("in progress..."); }

}
