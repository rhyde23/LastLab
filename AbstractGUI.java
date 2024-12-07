package LastLab.LastLab;

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.scene.input.KeyEvent;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.scene.layout.Pane;

import javafx.scene.text.Font;

import javafx.stage.Stage;

public abstract class AbstractGUI extends Application {
    
    protected final int PANE_WIDTH = 1000;
    
    protected final int PANE_HEIGHT = 600;
    
    protected boolean in_game = false;

    protected abstract void setupUI(Pane root);
    
    protected abstract void handleKeyPress(KeyEvent event);
    
    protected abstract String getTitle();
    
    protected Pane root;
    
    protected TextField p1_text_field;
    
    protected TextField p2_text_field;
    
    protected Player player1;
	
    protected Player player2;
    
    @Override
    public void start(Stage primaryStage) {
    	
        root = new Pane();
        
        this.setupIntro();

        Scene scene = new Scene(root, PANE_WIDTH, PANE_HEIGHT);
        
        scene.setOnKeyPressed(this::handleKeyPress);

        primaryStage.setTitle(getTitle());
        
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
    }
    
    protected void setupIntro() {
    	
        p1_text_field = new TextField();
        
        p1_text_field.setLayoutX(150);
        
        p1_text_field.setLayoutY(400);
        
        p2_text_field = new TextField();
        
        p2_text_field.setLayoutX(650);
        
        p2_text_field.setLayoutY(400);

        Button ready_button = new Button("Ready");

        ready_button.setLayoutX(445);
        
        ready_button.setLayoutY(500);
        
        ready_button.setOnAction(this::handleButtonPress);
        
        Label game_rules = new Label();

        game_rules.setText("Game Rules:\n\n1. Player 1 uses the left side of the keyboard to toggle between answers (Keys WASD, Left Shift to submit answer).\n\n2. Player 2 uses the right side of the keyboard to toggle between answers (Arrow keys, Enter to submit answer).\n\nWhoever submits their answer first correctly gets a point for that question.\n\nEnter your names below and press the ready button when both players are ready.");
        
        game_rules.setFont(new Font("Arial", 19));
        
        game_rules.setLayoutX(0);
       
        game_rules.setLayoutY(0);
        
        Label p1_tf_label = new Label();

        p1_tf_label.setText("Player 1's name: ");
        
        p1_tf_label.setFont(new Font("Arial", 12));
        
        p1_tf_label.setLayoutX(150);
       
        p1_tf_label.setLayoutY(380);
        
        Label p2_tf_label = new Label();

        p2_tf_label.setText("Player 2's name: ");
        
        p2_tf_label.setFont(new Font("Arial", 12));
        
        p2_tf_label.setLayoutX(650);
       
        p2_tf_label.setLayoutY(380);
        
        root.getChildren().addAll(p1_text_field, p2_text_field, ready_button, game_rules, p1_tf_label, p2_tf_label);
        
    }
    
    protected void setupEndScreen() {
    	
    	root.getChildren().clear();
    	
    	Label thanks_label = new Label();

    	thanks_label.setText("Thanks for playing, " + player1.getName() + " and " + player2.getName());
        
    	thanks_label.setFont(new Font("Arial", 15));
        
    	thanks_label.setLayoutX(0);
       
    	thanks_label.setLayoutY(0);
    	
    	Label result_label = new Label();

    	result_label.setText("Thanks for playing, " + player1.getName() + " and " + player2.getName());
    	
    	if(player1.getScore() > player2.getScore()) {
    		
    		result_label.setText(player1.getName() + " wins! (" + player1.getScore() + " - " + player2.getScore()+")");
    		
    	}
    	
    	else if(player2.getScore() > player1.getScore()) {
    		
    		result_label.setText(player2.getName() + " wins! (" + player2.getScore() + " - " + player1.getScore()+")");
    		
    	}
    	
    	else {
    		
    		result_label.setText("Tie game! (" + player1.getScore() + " - " + player2.getScore()+")");
    		
    	}
    	
    	result_label.setFont(new Font("Arial", 15));
        
    	result_label.setLayoutX(0);
       
    	result_label.setLayoutY(30);
        
        root.getChildren().addAll(thanks_label, result_label);
        
    }

    public void handleButtonPress(ActionEvent event) {
    	
    	player1 = new Player(p1_text_field.getText());
    	
    	player2 = new Player(p2_text_field.getText());
    	
    	in_game = true;
		
		setupUI(root);
        
    }
    
}