package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;

class BookServiceTest {

    BookService bookService = new BookService();
    BookDto bookDto = new BookDto();

    @Test
    void shouldGetBooks() {
        bookService.getBooks();
    }

    @Test
    void shouldAddBook() {
        bookService.addBook(bookDto);
    }

    @Test
    void shouldRemoveBook() {
        bookService.removeBook(bookDto);
    }
}