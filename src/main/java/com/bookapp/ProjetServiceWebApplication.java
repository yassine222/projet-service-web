package com.bookapp;

import com.bookapp.service.BookServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProjetServiceWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProjetServiceWebApplication.class, args);
    }




}
