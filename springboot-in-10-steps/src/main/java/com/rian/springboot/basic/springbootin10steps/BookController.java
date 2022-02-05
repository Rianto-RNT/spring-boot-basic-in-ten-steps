package com.rian.springboot.basic.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBook()
    {
        return Arrays.asList(new Book(1l, "The Hobbit", "Saproludin"));
    }
}
