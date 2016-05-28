/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rndmnkiii.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFXApp extends Application {
    //Really not necessary to include main method
    public static void main(String[] args){
        //Launch the JavaFX app
        Application.launch(args);
    }
    @Override
    public void start(Stage stage){
        //create a text messabe
        Text msg = new Text("Hola JavaFX");
        
        //toplevel node
        VBox root = new VBox();
        
        //add the child node to VBox root node
        root.getChildren().add(msg);
        
        //Create a scene
        Scene scene = new Scene(root, 300, 50);
        
        //set the scene to the stage
        stage.setScene(scene);
        
        //set a title for the stage
        stage.setTitle("Hola Aplicación JavaFX");
        
        //show the stage
        stage.show();
    }
}