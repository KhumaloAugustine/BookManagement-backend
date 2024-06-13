package com.augustinekhumalo.bookmanagement.resolver;

import com.augustinekhumalo.bookmanagement.model.Author;
import com.augustinekhumalo.bookmanagement.model.Book;
import com.augustinekhumalo.bookmanagement.repository.AuthorRepository;
import com.augustinekhumalo.bookmanagement.repository.BookRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public Mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Author newAuthor(String name) {
        Author author = new Author();
        author.setName(name);
        authorRepository.save(author);
        return author;
    }

    public Book newBook(String title, String description, Long authorId) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new RuntimeException("Author not found"));

        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        book.setDescription(description);

        bookRepository.save(book);
        return book;
    }

    public boolean deleteBook(Long id) {
        bookRepository.deleteById(id);
        return true;
    }

    public Book updateBookPageCount(int pageCount, long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);

        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();

            // Update the page count
//            book.setPageCount(pageCount);

            // Save the updated book
            bookRepository.save(book);

            return book; // Return the updated book
        } else {
            throw new IllegalArgumentException("Book not found with ID: " + id);
        }
    }
}
