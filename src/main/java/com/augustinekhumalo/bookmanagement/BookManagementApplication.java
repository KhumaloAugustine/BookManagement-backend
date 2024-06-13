package com.augustinekhumalo.bookmanagement;

import com.augustinekhumalo.bookmanagement.model.Author;
import com.augustinekhumalo.bookmanagement.model.Book;
import com.augustinekhumalo.bookmanagement.repository.AuthorRepository;
import com.augustinekhumalo.bookmanagement.repository.BookRepository;
import com.augustinekhumalo.bookmanagement.resolver.BookResolver;
import com.augustinekhumalo.bookmanagement.resolver.Mutation;
import com.augustinekhumalo.bookmanagement.resolver.Query;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookManagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}

	@Bean
	public BookResolver authorResolver(AuthorRepository authorRepository) {
		return new BookResolver(authorRepository);
	}

	@Bean
	public Query query(AuthorRepository authorRepository, BookRepository bookRepository) {
		return new Query(authorRepository, bookRepository);
	}

	@Bean
	public Mutation mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
		return new Mutation(authorRepository, bookRepository);
	}

	@Bean
	public CommandLineRunner demo(AuthorRepository authorRepository, BookRepository bookRepository) {
		return (args) -> {
			Author author = new Author("Herbert Schildt");
			authorRepository.save(author);

			bookRepository.save(new Book("Java: A Beginner's Guide, Sixth Edition", "A comprehensive guide to Java programming", author));
		};
	}
}
