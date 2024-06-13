package com.augustinekhumalo.bookmanagement.resolver;

import com.augustinekhumalo.bookmanagement.model.Author;
import com.augustinekhumalo.bookmanagement.model.Book;
import com.augustinekhumalo.bookmanagement.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLResolver<Book> {
    private final AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId())
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }
}