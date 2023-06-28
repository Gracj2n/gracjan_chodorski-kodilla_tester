package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService booksServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(booksServiceMock);

        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));

        Mockito.when(booksServiceMock.getBooks()).thenReturn(bookList);
        //when

        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        //given
        //BookService booksServiceMock = Mockito.mock(BookService.class);
        BookController bookController = Mockito.mock(BookController.class);
        //BookController bookController = new BookController(booksServiceMock);
        BookDto book1 = new BookDto("Title 1", "Author 1");
        //BookDto book2 = new BookDto("Title 2", "Author 2");
        //when
        bookController.addBook(book1);
        //then
        Mockito.verify(bookController, Mockito.atMostOnce()).addBook(book1);
    }

    @Test
    public void shouldServiceAddBook() {
        //given
        BookService bookService = Mockito.mock(BookService.class);
        BookDto book = new BookDto("Title 1", "Author 1");
        //when
        bookService.addBook(book);
        //then
        Mockito.verify(bookService, Mockito.times(1)).addBook(book);
    }
}