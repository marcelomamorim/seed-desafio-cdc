package com.br.casadocodigo.repository;

import com.br.casadocodigo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
