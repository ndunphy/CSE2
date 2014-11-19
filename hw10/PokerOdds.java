//Nicolette Dunphy
//HW10
//PokerOdds

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
   simulateOdds();
  }


public static int [] showHands(){
   
    
    String labels []= {"Clubs", "Diamonds", "Hearts", "Spades"}; //array of the suits
    String cardType []= {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}; //array of all the types of cards
    int [] suitCard= new int [5]; //new array relating to suits
   
    for (int q= 0; q<5; q++){ //sets value to suits array
        suitCard[q]=q;
        
    }
    
    
    
     int [] deck= new int [52]; //creates the whole deck
    for (int i=0; i<deck.length; i++){ //initializes values in deck array
        deck[i]=i; //sets values 
    }
    
    int [] hand= {-1, -1, -1, -1, -1}; //initialize and declare the hand array
    
    
     int card;
   int j=0;
  
   for (int x=0; x<5; x++){ 
     card=(int)(Math.random()*52); //picks random card value
    
            deck[card]=deck[51-x]; //accounts for swapping and having there be one less card
            deck[51-x]=-1; //sets value of that card in deck to -1
            hand[x]= card; //sets value of card to the hand
    }
    
    for(int y=0; y<5; y++){
        suitCard[y]= hand[y]; //sets suitCard to the value of the hand
        
    }
  
  int h=0; //initialize and declare h
  int g=0; //initialize and declare g
  int [] cardRank= new int [5]; //new array for cardRank
  
 
   
   
    for(int m=0; m<4; m++){ //prints out the suits of cards iterates 4 times
       
        System.out.print(labels[m]); //string of suits
     
        for (int z=0; z<5; z++){ //iterates 5 times for the number of cards drawn
            cardRank[z]= hand[z]%13; //ranks is calculated using modulus
            h=cardRank[z]; //sets value to h
           
            if(suitCard[z]==m){ //if the suit equlas the value in m
                 g= suitCard[z]; //g is set to that suit value
            
                
            }
       System.out.print(" " + cardType[h]); //type of card is printed based on array in beginning
           
        }
         
         System.out.println(""); //prints on new lines
        }
    
    
          return cardRank; //returns card rank for use in next method
    
    
    
    
    }
    
    public static void simulateOdds(){ 
      
        int [] cards= showHands(); //return value in previous method
        
        FindDuplicates.exactlyOneDup(cards); //calls method from other program
        
        
        
    }
    
    
    
}
