package com.br.casadocodigo.service;

import com.br.casadocodigo.model.Author;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    public Author create() {
        return new Author();
    }

}
