package com.bookapp.controllers;

import com.bookapp.models.Book;
import com.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("book-restapi")
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to our Web Service project";
    }
    @GetMapping("/all-books")
    public List<Book>getAllBooks() {
        return bookService.getAllBooks();
    }


    @GetMapping("/book-by-id/{id}")
    public Book getBookById(@PathVariable("id") int bookId){
        return bookService.getById(bookId);
    }

    @GetMapping("/books-by-author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author){
        return bookService.getBooksByAuthor(author);
    }
    @GetMapping("/books-by-category/")

    public List<Book> getBookByCategory(@RequestParam("category") String category){
        return bookService.getBooksByCategory(category);
    }
}
