package LastLab.LastLab;

import javafx.scene.input.KeyEvent;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Line;

import javafx.scene.shape.Rectangle;

import javafx.scene.text.Font;

import javafx.scene.control.Label;


public class MCGUI extends AbstractGUI {
	
	private MCAnswer answer = new MCAnswer();
	
	private Player player1 = new Player();
	
	private Player player2 = new Player();
	
	private int player1_selection = 0;
    
	private int player2_selection = 0;
	
	private int[] player1_selection_box_xs = {55, 200, 55, 200};
    
	private int[] player1_selection_box_ys = {PANE_HEIGHT-245, PANE_HEIGHT-245, PANE_HEIGHT-145, PANE_HEIGHT-145};     
    
	private int[] player2_selection_box_xs = {655, 800, 655, 800};
    
	private int[] player2_selection_box_ys = {PANE_HEIGHT-245, PANE_HEIGHT-245, PANE_HEIGHT-145, PANE_HEIGHT-145};  
	
	private Rectangle player1_selection_box = new Rectangle(135, 90);
    
	private Rectangle player2_selection_box = new Rectangle(135, 90);
	
	private Character[] chars = {'A', 'B', 'C', 'D'};
		
	private Label question;
	
	private Label questionA;
	
	private Label questionB;
	
	private Label questionC;
	
	private Label questionD;
	
	private Label player1_score_text;
	
	private Label player2_score_text;
	
	private Label player1_questionA;
	
	private Label player1_questionB;
	
	private Label player1_questionC;
	
	private Label player1_questionD;
	
	private Label player2_questionA;
	
	private Label player2_questionB;
	
	private Label player2_questionC;
	
	private Label player2_questionD;
	
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
		
		question = new Label(answer.getQuestion());
		
		question.setFont(Font.font("Arial", 15));
		
		question.setTextFill(Color.BLACK);
        
		question.setLayoutX(0);
		
		question.setLayoutY(0);
		
		questionA = new Label("A. " + answer.getQuestionA());
		
		questionA.setFont(Font.font("Arial", 15));
		
		questionA.setTextFill(Color.BLACK);
        
		questionA.setLayoutX(0);
		
		questionA.setLayoutY(50);
		
		questionB = new Label("B. " + answer.getQuestionB());
		
		questionB.setFont(Font.font("Arial", 15));
		
		questionB.setTextFill(Color.BLACK);
        
		questionB.setLayoutX(0);
		
		questionB.setLayoutY(80);
		
		questionC = new Label("C. " + answer.getQuestionC());
		
		questionC.setFont(Font.font("Arial", 15));
		
		questionC.setTextFill(Color.BLACK);
        
		questionC.setLayoutX(0);
		
		questionC.setLayoutY(110);
		
		questionD = new Label("D. " + answer.getQuestionD());
		
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
		
		player1_questionA = new Label("A");
		
		player1_questionA.setFont(Font.font("Arial", 25));
		
		player1_questionA.setTextFill(Color.BLACK);
        
		player1_questionA.setLayoutX(115);
		
		player1_questionA.setLayoutY(PANE_HEIGHT-220);
		
		player1_questionB = new Label("B");
		
		player1_questionB.setFont(Font.font("Arial", 25));
		
		player1_questionB.setTextFill(Color.BLACK);
        
		player1_questionB.setLayoutX(260);
		
		player1_questionB.setLayoutY(PANE_HEIGHT-220);
		
		player1_questionC = new Label("C");
		
		player1_questionC.setFont(Font.font("Arial", 25));
		
		player1_questionC.setTextFill(Color.BLACK);
        
		player1_questionC.setLayoutX(115);
		
		player1_questionC.setLayoutY(PANE_HEIGHT-115);
		
		player1_questionD = new Label("D");
		
		player1_questionD.setFont(Font.font("Arial", 25));
		
		player1_questionD.setTextFill(Color.BLACK);
        
		player1_questionD.setLayoutX(260);
		
		player1_questionD.setLayoutY(PANE_HEIGHT-115);
		
		player2_questionA = new Label("A");
		
		player2_questionA.setFont(Font.font("Arial", 25));
		
		player2_questionA.setTextFill(Color.BLACK);
        
		player2_questionA.setLayoutX(715);
		
		player2_questionA.setLayoutY(PANE_HEIGHT-220);
		
		player2_questionB = new Label("B");
		
		player2_questionB.setFont(Font.font("Arial", 25));
		
		player2_questionB.setTextFill(Color.BLACK);
        
		player2_questionB.setLayoutX(860);
		
		player2_questionB.setLayoutY(PANE_HEIGHT-220);
		
		player2_questionC = new Label("C");
		
		player2_questionC.setFont(Font.font("Arial", 25));
		
		player2_questionC.setTextFill(Color.BLACK);
        
		player2_questionC.setLayoutX(715);
		
		player2_questionC.setLayoutY(PANE_HEIGHT-115);
		
		player2_questionD = new Label("D");
		
		player2_questionD.setFont(Font.font("Arial", 25));
		
		player2_questionD.setTextFill(Color.BLACK);
        
		player2_questionD.setLayoutX(860);
		
		player2_questionD.setLayoutY(PANE_HEIGHT-115);
		
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
    	
		root.getChildren().addAll(question, questionA, questionB, questionC, questionD, player1Box,player2Box, line1, line2, line3, line4, player1_selection_box, player2_selection_box, player1_score_text, player2_score_text, player1_questionA, player1_questionB, player1_questionC, player1_questionD, player2_questionA, player2_questionB, player2_questionC, player2_questionD);

    }

    @Override
    protected void handleKeyPress(KeyEvent event) {
    	
    	if(in_game == true) { 

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
		        
		        case ENTER:
		        	
		        	if(answer.isCorrect(chars[player2_selection])) {
		        		
		        		player2.incrementScore();
		        		
		        		player2_score_text.setText("Player 2 score: " + player2.getScore());
		        		
		        	}
		        	
		        	answer.nextQuestion();
		        	
		        	player1_selection = 0;
		        	
		        	player2_selection = 0;
		        	
		        	question.setText(answer.getQuestion());
		    		
		        	questionA.setText("A. " + answer.getQuestionA());
		        	
		        	questionB.setText("C. " + answer.getQuestionB());
		        	
		        	questionC.setText("B. " + answer.getQuestionC());
		        	
		        	questionD.setText("D. " + answer.getQuestionD());
		        	
		        	break;
		        
		        case SHIFT:
		        	
		        	if(answer.isCorrect(chars[player1_selection])) {
		        		
		        		player1.incrementScore();
		        		
		        		player1_score_text.setText("Player 1 score: " + player1.getScore());
		        		
		        	}
		        	
		        	
		        	answer.nextQuestion();
		        		        	
		        	player1_selection = 0;
		        	
		        	player2_selection = 0;
		        	
		        	question.setText(answer.getQuestion());
		    		
		        	questionA.setText("A. " + answer.getQuestionA());
		        	
		        	questionB.setText("C. " + answer.getQuestionB());
		        	
		        	questionC.setText("B. " + answer.getQuestionC());
		        	
		        	questionD.setText("D. " + answer.getQuestionD());
		        	
		        	break;
		        	
	 	        
			}
			
			player2_selection_box.setX(player2_selection_box_xs[player2_selection]);          
			
	        player2_selection_box.setY(player2_selection_box_ys[player2_selection]);
	        
	        player1_selection_box.setX(player1_selection_box_xs[player1_selection]);          
			
	        player1_selection_box.setY(player1_selection_box_ys[player1_selection]);
    	}
    }

    @Override
    protected String getTitle() {
    	
        return "Multiple Choice Question";
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}