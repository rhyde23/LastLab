package LastLab.LastLab;

import javafx.scene.input.KeyEvent;


import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import javafx.scene.text.Font;

import javafx.scene.paint.Color;

import javafx.scene.control.Alert;

import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.Label;

public class GUI extends Application {
		
	public final int PANE_WIDTH = 1000;
	
	public final int PANE_HEIGHT = 600;
	
	private Answer answer = new Answer();
	
	private int player1_selection = 0;
    
	private int player2_selection = 0;
	
	private int[] player1_selection_box_xs = {55, 200, 55, 200};
    
	private int[] player1_selection_box_ys = {PANE_HEIGHT-245, PANE_HEIGHT-245, PANE_HEIGHT-145, PANE_HEIGHT-145};     
    
	private int[] player2_selection_box_xs = {655, 800, 655, 800};
    
	private int[] player2_selection_box_ys = {PANE_HEIGHT-245, PANE_HEIGHT-245, PANE_HEIGHT-145, PANE_HEIGHT-145};  
	
	private Rectangle player1_selection_box = new Rectangle(135, 90);
    
	private Rectangle player2_selection_box = new Rectangle(135, 90);
	
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
		
		questionD.setTextFill(Color.BLACK);
        
		questionD.setLayoutX(0);
		
		questionD.setLayoutY(140);
		
		Rectangle player1Box = new Rectangle(290, 200);
		
		player1Box.setFill(Color.BLUE);
	
		player1Box.setX(50);          
		
		player1Box.setY(PANE_HEIGHT-250);  
		
		player1Box.setStroke(Color.BLACK);
		
		player1Box.setStrokeWidth(10);
		
		Rectangle player2Box = new Rectangle(290, 200);
		
		player2Box.setFill(Color.BLUE);
	
		player2Box.setX(PANE_WIDTH-350);          
		
		player2Box.setY(PANE_HEIGHT-250);  
		
		player2Box.setStroke(Color.BLACK);
		
		player2Box.setStrokeWidth(10);
		
		Line line1 = new Line();
		
		line1.setStartX(195); 
		
        line1.setStartY(PANE_HEIGHT-250);
        
        line1.setEndX(195);
        
        line1.setEndY(PANE_HEIGHT-50);

        line1.setStrokeWidth(10);
        
        line1.setStroke(Color.BLACK);
        
        Line line2 = new Line();
		
		line2.setStartX(50); 
		
        line2.setStartY(PANE_HEIGHT-150);
        
        line2.setEndX(340);
        
        line2.setEndY(PANE_HEIGHT-150);

        line2.setStrokeWidth(10);
        
        line2.setStroke(Color.BLACK);
        
        Line line3 = new Line();
		
		line3.setStartX(PANE_WIDTH-205); 
		
        line3.setStartY(PANE_HEIGHT-250);
        
        line3.setEndX(PANE_WIDTH-205);
        
        line3.setEndY(PANE_HEIGHT-50);

        line3.setStrokeWidth(10);
        
        line3.setStroke(Color.BLACK);
        
        Line line4 = new Line();
		
		line4.setStartX(PANE_WIDTH-350); 
		
        line4.setStartY(PANE_HEIGHT-150);
        
        line4.setEndX(PANE_WIDTH-60);
         
        line4.setEndY(PANE_HEIGHT-150);

        line4.setStrokeWidth(10);
        
        line4.setStroke(Color.BLACK);
        
        player1_selection_box.setFill(Color.CYAN);
        
        player2_selection_box.setFill(Color.CYAN);
	
        player1_selection_box.setX(player1_selection_box_xs[player1_selection]);          
		
        player1_selection_box.setY(player1_selection_box_ys[player1_selection]);
        
        player2_selection_box.setX(player2_selection_box_xs[player2_selection]);          
		
        player2_selection_box.setY(player2_selection_box_ys[player2_selection]);  
		
		root.getChildren().addAll(question, questionA, questionB, questionC, questionD, player1Box,player2Box, line1, line2, line3, line4, player1_selection_box, player2_selection_box);
		
	    //Create Scene object
		Scene scene = new Scene(root, PANE_WIDTH, PANE_HEIGHT);
		
		scene.setOnKeyPressed(this::handleKeyPress);
		
		//Customize primaryStage and then call .show() method to display it
		primaryStage.setTitle("2D Game");
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
        
	}
	
	//Method to handle arrow key presses
	private void handleKeyPress(KeyEvent event) {
			
		//Switch statement for event key code
		switch (event.getCode()) {
				
			
	        case UP:
	        	
	        	if(player2_selection == 2 || player2_selection == 3) {
	        		
	        		player2_selection -= 2; 
	        		
	        	}
 	          

	        	break;
	        
	        case DOWN:
	        	
	        	if(player2_selection == 0 || player2_selection == 1) {
	        		
	        		player2_selection += 2; 
	        		
	        	}
 	          

	        	break;	
	        
	        case RIGHT:
	        	
	        	if(player2_selection == 0 || player2_selection == 2) {
	        		
	        		player2_selection += 1; 
	        		
	        	}
 	          

	        	break;	
	        
	        case LEFT:
	        	
	        	if(player2_selection == 1 || player2_selection == 3) {
	        		
	        		player2_selection -= 1; 
	        		
	        	}
 	          

	        	break;	
	        
	        	
	        case W:
	        	
	        	if(player1_selection == 2 || player1_selection == 3) {
	        		
	        		player1_selection -= 2; 
	        		
	        	}
 	          

	        	break;
	        
	        case S:
	        	
	        	if(player1_selection == 0 || player1_selection == 1) {
	        		
	        		player1_selection += 2; 
	        		
	        	}
 	          

	        	break;	
	        
	        case D:
	        	
	        	if(player1_selection == 0 || player1_selection == 2) {
	        		
	        		player1_selection += 1; 
	        		
	        	}
 	          

	        	break;	
	        
	        case A:
	        	
	        	if(player1_selection == 1 || player1_selection == 3) {
	        		
	        		player1_selection -= 1; 
	        		
	        	}
 	          

	        	break;	
		}
		
		player2_selection_box.setX(player2_selection_box_xs[player2_selection]);          
		
        player2_selection_box.setY(player2_selection_box_ys[player2_selection]);
        
        player1_selection_box.setX(player1_selection_box_xs[player1_selection]);          
		
        player1_selection_box.setY(player1_selection_box_ys[player1_selection]);
	}
	
	
	//Main method 
	public static void main(String[] args) {
				
		//Call "launch" method to run GUI program
		launch(args);
		        
	}
	
}
