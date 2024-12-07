package LastLab.LastLab;

import java.util.Scanner;

import java.util.InputMismatchException;

public class MainGUI {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        while(true) {
            
            System.out.println("Would you like to play the Multiple Choice game or T/F game?");
            
            System.out.print("Enter 1 for MC and 2 for T/F >> ");
            
            int input = 0; // Declare input variable outside try block

            // Use try-catch block to handle non-integer input
            try {
                input = scan.nextInt();

                if (input == 1) {
                	
                    MCGUI.main(args);
                    
                    break; // Exit loop if valid input is given
                    
                } else if (input == 2) {
                	
                    TFGUI.main(args);
                    
                    break; // Exit loop if valid input is given
                    
                } else {
                	
                    System.out.println("\nInvalid input, please enter 1 or 2.\n");
                    
                }

            } catch (InputMismatchException e) {
            	
            	
                System.out.println("\nInvalid input. Please enter an integer.\n");
                
                scan.nextLine(); // Clear the buffer to allow the user to enter again
                
            }
        }

        scan.close();
    }
}