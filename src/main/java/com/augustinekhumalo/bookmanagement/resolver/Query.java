package com.augustinekhumalo.bookmanagement.resolver;

import com.augustinekhumalo.bookmanagement.model.Author;
import com.augustinekhumalo.bookmanagement.model.Book;
import com.augustinekhumalo.bookmanagement.repository.AuthorRepository;
import com.augustinekhumalo.bookmanagement.repository.BookRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }
}