package LastLab.LastLab;

import javafx.scene.input.KeyEvent;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Line;

import javafx.scene.shape.Rectangle;

import javafx.scene.text.Font;

import javafx.scene.control.Label;

public class TFGUI extends AbstractGUI {
	
	private TFAnswer answer = new TFAnswer();
	
	private Player player1 = new Player();
	
	private Player player2 = new Player();
	
	private int player1_selection = 0;
    
	private int player2_selection = 0;
	
	private int[] player1_selection_box_xs = {55, 200};
        
	private int[] player2_selection_box_xs = {655, 800};
    	
	private Rectangle player1_selection_box = new Rectangle(135, 190);
    
	private Rectangle player2_selection_box = new Rectangle(135, 190);
	
	private Character[] chars = {'T', 'F'};
		
	private Label question;
	
	private Label player1_score_text;
	
	private Label player2_score_text;
	
	private Label player1_questionT;
	
	private Label player1_questionF;
	
	private Label player2_questionT;
	
	private Label player2_questionF;
	
    @Override
    protected void setupUI(Pane root) {
    	
    	root.getChildren().clear();
       
    	player1_score_text = new Label("Player 1 score: " + player1.getScore());
		
		player1_score_text.setFont(Font.font("Arial", 15));
		
		player1_score_text.setTextFill(Color.BLACK);
        
		player1_score_text.setLayoutX(140);
		
		player1_score_text.setLayoutY(275);
		
		player2_score_text = new Label("Player 2 score: " + player2.getScore());
		
		player2_score_text.setFont(Font.font("Arial", 15));
		
		player2_score_text.setTextFill(Color.BLACK);
        
		player2_score_text.setLayoutX(740);
		
		player2_score_text.setLayoutY(275);
		
		question = new Label(answer.getTFQuestion());
		
		question.setFont(Font.font("Arial", 15));
		
		question.setTextFill(Color.BLACK);
        
		question.setLayoutX(0);
		
		question.setLayoutY(0);
		
		Rectangle player1Box = new Rectangle(290, 200);
		
		player1Box.setFill(Color.BLUE);
	
		player1Box.setX(50);          
		
		player1Box.setY(PANE_HEIGHT-250);  
		
		player1Box.setStroke(Color.BLACK);
		
		player1Box.setStrokeWidth(10);
		
		player1_questionT = new Label("T");
		
		player1_questionT.setFont(Font.font("Arial", 25));
		
		player1_questionT.setTextFill(Color.BLACK);
        
		player1_questionT.setLayoutX(115);
		
		player1_questionT.setLayoutY(PANE_HEIGHT-220);
		
		player1_questionF = new Label("F");
		
		player1_questionF.setFont(Font.font("Arial", 25));
		
		player1_questionF.setTextFill(Color.BLACK);
        
		player1_questionF.setLayoutX(260);
		
		player1_questionF.setLayoutY(PANE_HEIGHT-220);
		
		player2_questionT = new Label("T");
		
		player2_questionT.setFont(Font.font("Arial", 25));
		
		player2_questionT.setTextFill(Color.BLACK);
        
		player2_questionT.setLayoutX(715);
		
		player2_questionT.setLayoutY(PANE_HEIGHT-220);
		
		player2_questionF = new Label("F");
		
		player2_questionF.setFont(Font.font("Arial", 25));
		
		player2_questionF.setTextFill(Color.BLACK);
        
		player2_questionF.setLayoutX(860);
		
		player2_questionF.setLayoutY(PANE_HEIGHT-220);
		
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
		
		line2.setStartX(PANE_WIDTH-205); 
		
        line2.setStartY(PANE_HEIGHT-250);
        
        line2.setEndX(PANE_WIDTH-205);
        
        line2.setEndY(PANE_HEIGHT-50);

        line2.setStrokeWidth(10);
        
        line2.setStroke(Color.BLACK);
        
        player1_selection_box.setFill(Color.CYAN);
        
        player2_selection_box.setFill(Color.CYAN);
	
        player1_selection_box.setX(player1_selection_box_xs[player1_selection]);          
		
        player1_selection_box.setY(PANE_HEIGHT-245);
        
        player2_selection_box.setX(player2_selection_box_xs[player2_selection]);          
		
        player2_selection_box.setY(PANE_HEIGHT-245);  
    	
        root.getChildren().addAll(player1_score_text, player2_score_text, question, player1Box, player1_selection_box, player2Box, player2_selection_box, player1_questionT, player1_questionF, player2_questionT, player2_questionF, line1, line2);

    }

    @Override
    protected void handleKeyPress(KeyEvent event) {
    	
    	if(in_game == true) {
    		
    		switch (event.getCode()) {
	        
	        case RIGHT:
	        	
	        	if(player2_selection == 0) {
	        		
	        		player2_selection += 1; 
	        		
	        	}
 	          

	        	break;	
	        
	        case LEFT:
	        	
	        	if(player2_selection == 1) {
	        		
	        		player2_selection -= 1; 
	        		
	        	}
 	          

	        	break;	
	        
	        case D:
	        	
	        	if(player1_selection == 0) {
	        		
	        		player1_selection += 1; 
	        		
	        	}
 	          

	        	break;	
	        
	        case A:
	        	
	        	if(player1_selection == 1) {
	        		
	        		player1_selection -= 1; 
	        		
	        	}
 	          

	        	break;
	        
	        case ENTER:
	        	
	        	if(answer.isCorrect(chars[player2_selection])) {
	        		
	        		player2.incrementScore();
	        		
	        		player2_score_text.setText("Player 2 score: " + player2.getScore());
	        		
	        	}
	        	
	        	answer.nextQuestion();
	        	
	        	player1_selection = 0;
	        	
	        	player2_selection = 0;
	        	
	        	question.setText(answer.getTFQuestion());
	        	
	        	break;
	        
	        case SHIFT:
	        	
	        	if(answer.isCorrect(chars[player1_selection])) {
	        		
	        		player1.incrementScore();
	        		
	        		player1_score_text.setText("Player 1 score: " + player1.getScore());
	        		
	        	}
	        	
	        	
	        	answer.nextQuestion();
	        	
	        	player1_selection = 0;
	        	
	        	player2_selection = 0;
	        	
	        	question.setText(answer.getTFQuestion());
	        	
	        	break;
	        	
 	        
		}
		
		player2_selection_box.setX(player2_selection_box_xs[player2_selection]);          
		
        player2_selection_box.setY(PANE_HEIGHT-245);
        
        player1_selection_box.setX(player1_selection_box_xs[player1_selection]);          
		
        player1_selection_box.setY(PANE_HEIGHT-245);
    		
    	}
    	
    }

    @Override
    protected String getTitle() {
        return "True/False Question";
    }

    public static void main(String[] args) {
        launch(args);
    }

}