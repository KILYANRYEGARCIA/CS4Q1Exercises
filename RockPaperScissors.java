/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer4;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kilya
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		
                
                int playerScore = 0;
                int computerScore = 0;
                int roundsToWin = 2;
                Move m1 = null;
                Move m2 = null;
                
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit the application");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        while (playerScore < roundsToWin && computerScore < roundsToWin) {
                        System.out.println("This match will be first to " + roundsToWin + " wins.");
                        System.out.println("The computer has made its move. Select your move.");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        int computerMove = (int) Math.floor(Math.random()*3) + 1;
                            switch(computerMove) {
                                case 1: m2 = rock;
                                case 2: m2 = paper;
                                case 3: m2 = scissors;
                                default:
                                break;
                            }
                        int playerMove = scanner.nextInt();
                             switch(playerMove) {
                                case 1: m1 = rock;
                                case 2: m1 = paper;
                                case 3: m1 = scissors;
                                default: System.out.println("Please enter a value from 1 to 3.");
                                break;
                             }int roundResult = Move.compareMoves(m1, m2);
                             switch(roundResult){
                                 case 0: playerScore ++;
                                     System.out.println( "Player wins" +"Player: " + playerScore + " | Computer: " + computerScore); 
                                 case 1: computerScore ++;
                                     System.out.println("Computer wins" + "Player: " + playerScore + " | Computer: " + computerScore);
                                 default: 
                                     System.out.println("Draw");
                                 break;
                             }
                             
                             
                          
                        } 
                            /** String roundResult = determineRoundWinner(String m1,String m2);
            System.out.println("Round result: " + roundResult);

            if (roundResult.equals("Player wins!")) {
                playerScore++;
            } else if (roundResult.equals("Computer wins!")) {
                computerScore++;
            }
            * */
                    
                        break;
                     
                    case 2:
                        System.out.println("How many rounds are needed to win a match?");
                       roundsToWin = scanner.nextInt();
                        System.out.println("New Settings have been saved!");
                        
                        break;
                    case 3: 
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter a value from 1 to 3.");
	}    

	}       public static String determineRoundWinner(String m1, String m2) {
        if (m1.equals(m2)) {
            return "It's a tie!";
        } else if ((m1.equals("rock") && m2.equals("scissors")) ||
                   (m1.equals("scissors") && m2.equals("paper")) ||
                   (m1.equals("paper") && m2.equals("rock"))) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }   
                
}

    }
    

