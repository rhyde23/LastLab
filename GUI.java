package LastLab;

import javafx.scene.input.KeyEvent;


import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

import javafx.scene.layout.Pane;

import javafx.scene.shape.Rectangle;

import javafx.scene.text.Font;

import javafx.scene.paint.Color;

import javafx.scene.control.Alert;

import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.Label;

public class GUI extends Application {
		
	public final int PANE_WIDTH = 1000;
	
	public final int PANE_HEIGHT = 600;
	
	Answer answer = new Answer();
	
	public void start(Stage primaryStage) {
		
		//Create GridPane object
		Pane root = new Pane();
	
	    //Add JavaFX objects to GridPane object

		Label question = new Label(answer.getQuestion());
		
		question.setFont(Font.font("Arial", 20));
		
		question.setTextFill(Color.BLACK);
        
		question.setLayoutX(0);
		
		question.setLayoutY(0);
		
		Label questionA = new Label("A. " + answer.getQuestionA());
		
		questionA.setFont(Font.font("Arial", 15));
		
		questionA.setTextFill(Color.BLACK);
        
		questionA.setLayoutX(0);
		
		questionA.setLayoutY(50);
		
		Label questionB = new Label("B. " + answer.getQuestionB());
		
		questionB.setFont(Font.font("Arial", 15));
		
		questionB.setTextFill(Color.BLACK);
        
		questionB.setLayoutX(0);
		
		questionB.setLayoutY(80);
		
		Label questionC = new Label("C. " + answer.getQuestionC());
		
		questionC.setFont(Font.font("Arial", 15));
		
		questionC.setTextFill(Color.BLACK);
        
		questionC.setLayoutX(0);
		
		questionC.setLayoutY(110);
		
		Label questionD = new Label("D. " + answer.getQuestionD());
		
		questionD.setFont(Font.font("Arial", 15));
		
		questionD.setTextFill(Color.RED);
        
		questionD.setLayoutX(0);
		
		questionD.setLayoutY(140);
		
		root.getChildren().addAll(question, questionA, questionB, questionC, questionD);
		
	    //Create Scene object
		Scene scene = new Scene(root, PANE_WIDTH, PANE_HEIGHT);
		
		//Customize primaryStage and then call .show() method to display it
		primaryStage.setTitle("2D Game");
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
        
	}
	
	
	//Main method 
	public static void main(String[] args) {
				
		//Call "launch" method to run GUI program
		launch(args);
		        
	}
	
}
