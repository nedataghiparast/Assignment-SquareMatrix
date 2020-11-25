package com.neda.LibraryApp;

import com.neda.LibraryApp.model.Book;
import com.neda.LibraryApp.model.BookService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DialogController {
    @FXML
    private TextField newBookTitleTextField;
    @FXML
    private TextField newBookAuthorTextField;

    public void processNewBook() {
        String title = newBookTitleTextField.getText();
        String Author = newBookAuthorTextField.getText();


        System.out.println("current title: " + title);
        System.out.println("current Author: " + Author);

        Book newBook = new Book(title,Author);
        BookService.getInstance().addBook(newBook);
    }
}
