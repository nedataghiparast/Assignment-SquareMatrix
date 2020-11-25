package com.neda.LibraryApp.model;

import javafx.collections.FXCollections;

import java.io.*;
import java.util.List;

public class BookService {

    private static BookService instance = new BookService();
    private List<Book> books;

    private BookService() {

    }

    public static BookService getInstance() {
        return instance;
    }

    public static void setInstance(BookService instance) {
        BookService.instance = instance;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBookToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Book.txt"));
            for (Book book : this.books) {
                bw.write(book.getTitle() + "\t" + book.getAuthor() + "\t");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("IO Exception occurred when trying to write to book.txt");
            e.printStackTrace();
        }
    }

    public void getBookFromFile() {
        books = FXCollections.observableArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Book.txt"));
            String fileData;
            while ((fileData = br.readLine()) != null) {
                String[] fileLineArr = fileData.split("/t");
                String bookTitle = fileLineArr[0];
                String bookAuthor = fileLineArr[0];
                System.out.println(bookTitle);
                System.out.println(bookAuthor);
                Book book = new Book(bookTitle, bookAuthor);
                books.add(book);

            }

        } catch (IOException e) {
            System.out.println("IO Exception occurred when trying to read to book.txt");
            e.printStackTrace();
        }

    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }
}
