package com.augustinekhumalo.bookmanagement.repository;

import com.augustinekhumalo.bookmanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> { }
