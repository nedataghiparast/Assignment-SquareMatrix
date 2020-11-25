package com.neda.LibraryApp;

import com.neda.LibraryApp.model.Book;
import com.neda.LibraryApp.model.BookService;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller {
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private ListView<Book> bookListView;
    @FXML
    private TextArea windowTextArea;
    @FXML
    private Label createDateLabel;
    private List<Book> books = new ArrayList<>();

    public void initialize() {
        Book book1 = new Book("Sapiens", "Yuval");
        Book book2 = new Book("Homo Deus", "Yuval");
        Book book3 = new Book("The Piano", "Border Rosemary");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        bookListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Book>() {
            @Override
            public void changed(ObservableValue<? extends Book> unusedValue1, Book book, Book t1) {
                if (book != null) {
                    Book selectedBook = bookListView.getSelectionModel().getSelectedItem();
                    windowTextArea.setText(selectedBook.getAuthor());


                }
            }

        });

        bookListView.getItems().setAll(books);
        //  bookListView.getItems().setAll(BookService.getInstance().getBooks());


        bookListView.getSelectionModel().selectFirst();

    }

    public void showNewNoteWindow(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("newBookDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }
        catch (IOException e) {
            System.out.println("IOException Could not load new book Dialog");
            e.printStackTrace();
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> result = dialog.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController controller = fxmlLoader.getController();
            controller.processNewBook();
            bookListView.getItems().setAll(BookService.getInstance().getBooks());
            System.out.println("New Book created!");

        }
        else {
            System.out.println("New Book Cancelled");
        }
    }

    public void updateListView(MouseEvent mouseEvent) {
    }
}
