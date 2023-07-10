package com.br.casadocodigo.repository;

import com.br.casadocodigo.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
