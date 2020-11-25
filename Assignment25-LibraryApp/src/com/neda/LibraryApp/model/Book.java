package com.neda.LibraryApp.model;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    LocalDate creationDate = LocalDate.now();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
