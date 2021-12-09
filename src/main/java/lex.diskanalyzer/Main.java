package lex.diskanalyzer;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        stage.setTitle("Disk analyzer");


    }
}
