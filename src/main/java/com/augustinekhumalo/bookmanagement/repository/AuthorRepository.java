package com.augustinekhumalo.bookmanagement.repository;

import com.augustinekhumalo.bookmanagement.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> { }
