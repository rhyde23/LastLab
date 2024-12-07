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
    	
        TextField p1_text_field = new TextField();
        
        p1_text_field.setLayoutX(150);
        
        p1_text_field.setLayoutY(400);
        
        TextField p2_text_field = new TextField();
        
        p2_text_field.setLayoutX(650);
        
        p2_text_field.setLayoutY(400);

        Button ready_button = new Button("Ready");

        ready_button.setLayoutX(445);
        
        ready_button.setLayoutY(500);
        
        ready_button.setOnAction(this::handleButtonPress);
        
        Label game_rules = new Label();

        game_rules.setText("Game Rules:\n1. Player 1 uses the left side of the keyboard to toggle between answers (Keys WASD, Left Shift to submit answer).\n2. Player 2 uses the right side of the keyboard to toggle between answers (Arrow keys, Enter to submit answer).\nWhoever submits their answer first correctly gets a point for that question.\nEnter your names below and press the ready button when both players are ready.");
        
        game_rules.setFont(new Font("Arial", 19));
        
        game_rules.setLayoutX(0);
       
        game_rules.setLayoutY(0);
        
        Label p1_tf_label = new Label();

        p1_tf_label.setText("Player 1's name: ");
        
        p1_tf_label.setFont(new Font("Arial", 19));
        
        p1_tf_label.setLayoutX(0);
       
        p1_tf_label.setLayoutY(0);
        
        root.getChildren().addAll(p1_text_field, p2_text_field, ready_button, game_rules);
        
    }

    public void handleButtonPress(ActionEvent event) {
    	
    	in_game = true;
		
		setupUI(root);
        
    }
    
}