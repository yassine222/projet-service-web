package com.bookapp.service;

import com.bookapp.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl  implements BookService{







    @Override
    public Book getById(int bookId) {
        return getBookList()
                .stream()
                .filter((book)->book.getBookId()==bookId)
                .findAny()
                .orElse(new Book());
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return getBookList()
                .stream()
                .filter((book )-> book.getAuthor().equals(author))
                        .collect(Collectors.toList());
    }

    @Override
    public List<Book> getBooksByCategory(String category) {
        return getBookList()
                .stream()
                .filter((book )-> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return getBookList().stream().toList();
    }

    private List<Book> getBookList(){
        return Arrays.asList(new Book("Java","Seif","Tech",10),
                new Book("Spring","Yassine","Tech",11),
                new Book("Miracle","Ihab","Fiction",12),
                new Book("Captain","Seif","Comic",13),
                new Book("Ferrari","Yassine","Fiction",14),
                new Book("Skull","Ihab","Horror",15));

    }
}
