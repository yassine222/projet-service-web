package com.bookapp.controllers;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestClient {
    private static final String get_book_by_id="http://localhost:8080/book-restapi/books-by-id/{id}";
    private static final String get_book_by_author="http://localhost:8080/book-restapi/books-by-author/{author}";
    private static final String get_all_books="http://localhost:8080/book-restapi/all-books";


    static RestTemplate restTemplate =new RestTemplate();
    public static void main(String[]args){
        callGetAllBookApi();

    }

    private static void callGetAllBookApi(){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String>entity =new HttpEntity<>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(get_all_books, HttpMethod.GET,entity, String.class);
        System.out.println(result);

    }

}
