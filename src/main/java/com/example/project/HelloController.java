package com.example.project;
import java.net.URL;
import java.util.*;
import java.lang.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController implements Initializable {

    private Stage stage;

    private Scene scene;

    private Parent root;

    @FXML
    public Label progress;
    public static Label label;

    @FXML
    private ProgressBar progressBar;
    public static ProgressBar statProgressBar;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        label = progress;
        statProgressBar = progressBar;
    }

    public HelloController() {
    }

    @FXML
    public void switchToScene2(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);

        stage.setScene(scene);

        stage.show();

    }
    public void switchToScene1(ActionEvent event) throws IOException
    {
        //Add a comment here
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);

        stage.setScene(scene);

        stage.show();

    }
    public void closeGame(ActionEvent event) throws IOException
    {
        System.exit(0);
    }

}