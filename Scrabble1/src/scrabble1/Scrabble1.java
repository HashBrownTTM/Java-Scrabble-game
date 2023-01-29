/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble1;

/**
 *
 * @author 19005489
 */
import java.util.Scanner;
public class Scrabble1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String selection, player1, player2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the WORD WARS game."); 
        System.out.println("\nPress (1) To start the game."); 
        System.out.print("\nPress any other key to exit the game" +
                "\nEnter your selection: ");
        
        selection = input.nextLine();
        System.out.println("*********************************");
        
        while(selection.equals("1"))
        {
            System.out.print("Enter player 1 name: ");
            player1 = input.nextLine();
            System.out.print("Enter player 2 name: ");
            player2 = input.nextLine();
            //calls the method which starts the scrabble game
            wordWars(input, player1, player2);
            
            System.out.print("\nWould you like to play again? "
                    + "\nEnter (1) if you would like to play again, or any "
                    + "other key to end the game" + "\nEnter your selection: ");
            selection = input.nextLine();
        }
        
            System.out.println("\nTHE GAME IS NOW OVER. THANK YOU FOR PLAYING WORD WARS!!!");
    }//end of main method 
    
    //method which starts the scrabble game
    public static void wordWars(Scanner input, String player1, String player2){
        String word, alphabetString = " ";
        String agreement, lettersUsed = " ";
        boolean bUsedLetter = false;
    
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
             'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 
             'x', 'y', 'z'};
        
        final int ALPHA_NUM = alphabet.length;
        final String END_GAME = "???";
        final String ERROR_STATEMENT = "YOU ENTERED A WORD THAT CONTAINS A "
                + "LETTER THAT IS USED OR IS NOT VALID. PLEASE ENTER "
                + "ANOTHER WORD!";
        
        int pointsP1 = 0, pointsP2 = 0;
        word = "";
        System.out.println("\nLETS PLAY WORD WARS!!!");
        
        while(!(word.equals(END_GAME))){
            System.out.print("Alpabet letters left: ");
        
            for(int x = 0; x < ALPHA_NUM; ++x)
                alphabetString = alphabetString + (alphabet[x] + " ");
            
            System.out.println(alphabetString);
            System.out.print(player1 + " enter your word: ");
            word = input.nextLine();
            
            /*the following block of code used to check if a word contails
            letters that have already been used*/
            for(int i = 0; i < word.length(); ++i){
                for(int a = 0; a < lettersUsed.length(); ++a){
                    while(word.charAt(i) == lettersUsed.charAt(a) 
                            ||  (bUsedLetter = false)){
                        System.out.println(ERROR_STATEMENT);
                        System.out.print(player1 + " enter your word: ");
                        word = input.nextLine();
                        
                        if(bUsedLetter == true)
                            bUsedLetter = true;
                    }    
                }
            }

            bUsedLetter = false;
            
            if(word.equals(END_GAME)){
                agreement = "y";
                //"break" exits the first while loop if word equals "???"
                break;
            }
            else{
                System.out.println("Enter (y) yes if both players agree on the word");
                agreement = input.nextLine();
            }
            
            if(agreement.equals("y")){
                //removes the letters found in a word from the alphabet list
                for(int y = 0; y < word.length(); ++y){
                    for(int x = 0; x < ALPHA_NUM; ++x){
                        if((alphabet[x] == word.charAt(y)) && 
                                (alphabet[x] != 'a') && 
                                (alphabet[x] != 'e')&& 
                                (alphabet[x] != 'i')&& 
                                (alphabet[x] != 'o')&& 
                                (alphabet[x] != 'u')){
                            lettersUsed = lettersUsed + alphabet[x];
                            alphabet[x] = ' ';
                        }   
                    }        
                } 
            }
            else{//if agreement does not equal "y"
                System.out.println("No points given to " + player1.toUpperCase());
                word = "";
            } 
            
            pointsP1 = pointsP1 + word.length();
            //makes sure that ??? is not included as part of pointsP1
            if(word.equals(END_GAME))
                pointsP1 = pointsP1 - word.length();

            alphabetString = "";
            word = "";
            System.out.print("Alpabet letters left: ");
        
            for(int x = 0; x < ALPHA_NUM; ++x)
                alphabetString = alphabetString + (alphabet[x] + " ");
            
            System.out.println(alphabetString);
            System.out.print(player2 + " enter your word: ");
            word = input.nextLine();
            
            /*the following block of code used to check if a word contails
            letters that have already been used*/
            for(int i = 0; i < word.length(); ++i){
                for(int a = 0; a < lettersUsed.length(); ++a){
                    while(word.charAt(i) == lettersUsed.charAt(a) 
                            || (bUsedLetter = false)){
                        System.out.println(ERROR_STATEMENT);
                        System.out.print(player2 + " enter your word: ");
                        word = input.nextLine();
                        
                        if(bUsedLetter == true)
                            bUsedLetter = true;
                    }    
                }
            }

            bUsedLetter = false;
            
            if(word.equals(END_GAME))
                agreement = "y";
            else{
                System.out.println("Enter (y) yes if both players agree on the word");
                agreement = input.nextLine();
            }
            
            if(agreement.equals("y")){
                //removes the letters found in a word from the alphabet list
                for(int y = 0; y < word.length(); ++y){
                    for(int x = 0; x < ALPHA_NUM; ++x){
                        if((alphabet[x] == word.charAt(y)) && 
                                (alphabet[x] != 'a') && 
                                (alphabet[x] != 'e')&& 
                                (alphabet[x] != 'i')&& 
                                (alphabet[x] != 'o')&& 
                                (alphabet[x] != 'u')){
                            lettersUsed = lettersUsed + alphabet[x];
                            alphabet[x] = ' ';
                        }   
                    }        
                } 
            }  
            else{//if agreement does not equal "y"
                System.out.println("No points given to " + player2.toUpperCase());
                word = "";    
            }
              
            pointsP2 = pointsP2 + word.length();
            //makes sure that ??? is not included as part of pointsP2
            if(word.equals(END_GAME))
                pointsP2 = pointsP2 - word.length();
            
            alphabetString = "";
        }
        
        //nested if used to display the results of the end of the game
        if(pointsP1 == pointsP2)
            System.out.println("\nPLAYER 1- " + player1.toUpperCase() 
                + " AND PLAYER 2- "+ player2.toUpperCase() + " HAVE A DRAW " 
                + "(" + pointsP1 + " points each)."
                + "\nTHE GAME IS NOW OVER. THANK YOU FOR PLAYING WORD WARS!!!");
        else if(pointsP1 > pointsP2)
            System.out.println("WINNER OF THE GAME IS: " + player1.toUpperCase()
                + " with a score of: " + pointsP1 
                + "\nYOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!" 
                + "\nTHE GAME IS NOW OVER. THANK YOU FOR PLAYING WORD WARS!!!");
        else if(pointsP1 < pointsP2)
            System.out.println("WINNER OF THE GAME IS: " + player2.toUpperCase()
                + " with a score of: " + pointsP2 
                + "\nYOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!" 
                + "\nTHE GAME IS NOW OVER. THANK YOU FOR PLAYING WORD WARS!!!");   
    }//end of wordWars method   
}
