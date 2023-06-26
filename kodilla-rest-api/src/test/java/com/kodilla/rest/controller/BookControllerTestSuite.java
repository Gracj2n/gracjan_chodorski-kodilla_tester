package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
}