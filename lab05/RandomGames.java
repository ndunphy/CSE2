//Nicolette Dunphy
//Lab5- Random Games
//CSE2
//due 9/25/14

//Program uses info obtained from user and either initiates Roulette,
//Craps, or Picking a card from a deck of playing cards.

//import scanner class
import java.util.Scanner;

//class 
public class RandomGames{
//main method
    public static void main(String[] args){
        
        //declare Scanner object
        Scanner myScanner;
        myScanner= new Scanner ( System.in );
        
        //prompt user for type of game
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        
        //declare variables
        String userInput;
        userInput= myScanner.next();
        int roulette= ((int)(Math.random()*37)+1);
        int suit=((int)(Math.random()*(4))+1);
        int card=((int)(Math.random()*(14-2))+2);
        int dice= ((int)(Math.random()*6)+1);
        int dice1=((int)(Math.random()*6)+1);
        String x = Integer.toString(suit); //changes value of suit into a string (ex. Spades, etc)
        String card2= Integer.toString(card); //changes value of card into a string (ex. King,etc)
      
        
        
        //switch statement
        
        switch(userInput){
            case "r": //if user types 'r'
                System.out.println("Roulette: " + roulette);
                
                switch(roulette){
                    case 37: //if random number generates 37 it changes to 00
                        System.out.println("Roulette: 00");
                        break;
                }
                break;
            case "R": //if user types 'R'
                System.out.println("Roulette: " + roulette);
                
                switch(roulette){
                    case 37://if random number generates 37 it changes to 00
                        System.out.println("Roulette: 00");
                        break;
                }
                break;
            case "c": //if user types 'c'
                System.out.println("Craps: " + dice +"+"+ dice1 + "=" + (dice+dice1));
                break; //prints one random dice roll and adds it to another random dice roll
            case "C": //if user types 'C'
                System.out.println("Craps: " + dice +"+"+ dice1 + "=" + (dice+dice1));
                break; //prints one random dice roll and adds it to another random dice roll
            case "p": //if user types 'p'
                    
                switch(card){ 
                    case 11: //if random number is 11 value changes to "jack"
                         card2="Jack";
                    break;
                    case 12: //if random number is 12 value changes to "queen"
                        card2="Queen";
                     break;   
                    case 13: //if random number is 13 value changes to "king"
                        card2="King";
                        break;
                    case 14: //if random number is 14 value changes to "ace"
                        card2="Ace";
                    
                }
                 switch(suit){  //adds suit
                    case 1: //if random suit number is 1 value is "heart"
                        x="hearts";
                        break;
                    case 2: //if random suit number is 2 value is "diamonds"
                        x="diamonds";
                        break;
                    case 3: //if random suit number is 3 value is "clubs"
                        x="clubs";
                        break;
                    case 4: //if random suit number is 4 value is "spades"
                        x="spades";
                
                    break;}
                System.out.println(card2 + " of " + x);
                break;
            case "P": //same as 'p'
            
                 switch(card){
                     case 11:
                       card2="Jack";
                        break;
                    case 12:
                        card2="Queen";
                        break;
                    case 13:
                        card2="King";
                        break;
                    case 14:
                        card2="Ace";
                     
                 }
                    
                switch(suit){
                    case 1:
                        x="hearts";
                        break;
                    case 2:
                        x="diamonds";
                        break;
                    case 3:
                        x="clubs";
                        break;
                    case 4:
                        x="spades";
                    break;
                }
                System.out.println(card2 + " of " + x); 
                break;
                
                default: //if none of the options are used it prints out this error message
                    System.out.println(userInput + " is not one of 'R','r', 'c', 'C', 'p', or 'P'");
                    break;
                 }
        }

    }




