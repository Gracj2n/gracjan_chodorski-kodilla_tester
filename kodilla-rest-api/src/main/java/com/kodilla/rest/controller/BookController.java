package com.kodilla.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<BookDto> getBooks() {
        return new ArrayList<>();
    }

}
