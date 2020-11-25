package com.neda.LibraryApp;

import com.neda.LibraryApp.model.BookService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        primaryStage.setTitle("LibraryApp");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    @Override
    public void init() {
        BookService.getInstance().getBookFromFile();

    }
    @Override
    public void stop() {
        BookService.getInstance().addBookToFile();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
