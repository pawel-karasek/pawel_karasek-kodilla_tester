package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Author 1", "Title 1"));
        bookList.add(new BookDto("Author 2", "Title 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        BookDto bookDto = new BookDto("author", "title");

        Mockito.doAnswer(i -> {
            Object[] arguments = i.getArguments();
            BookDto bookdto = (BookDto) arguments[0];
            bookList.add(bookdto);
            return null;
        }).when(bookServiceMock).addBook(bookDto);

        //when
        bookController.addBook(bookDto);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        List<BookDto> result = bookController.getBooks();
        BookDto bdto = result.get((0));
        //then
        assertThat(bdto).isNotNull();
    }

    @Test
    public void shouldAddBookVerify() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        BookDto bookDto = new BookDto("author", "title");
        bookController.addBook(bookDto);
        bookController.addBook(bookDto);
        verify(bookServiceMock,times(2)).addBook(bookDto);
    }

    @Test
    void shouldRemoveBook() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        BookDto bookDto = new BookDto("author", "title");
        bookController.addBook(bookDto);
        bookController.removeBook(bookDto);
        verify(bookServiceMock,times(1)).addBook(bookDto);
        verify(bookServiceMock, times(1)).removeBook(bookDto);
    }

    @Test
    void shouldPrintAuthorAndTitle() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto = new BookDto("author", "title");
        System.out.println(bookDto.getAuthor() + ", " + bookDto.getTitle());
    }
}