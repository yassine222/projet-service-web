package com.bookapp.models;

import jdk.jfr.Enabled;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private String title;
    private String author;
    private String category;
    private int bookId;

}
