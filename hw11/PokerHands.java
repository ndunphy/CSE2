//Nicolette Dunphy
//HW11
//Poker Hands
//Purpose: Rank inputted poker hands according to how common they are 

/* Sample Output:
Enter 'y' or 'Y' to enter a(nother) hand- y
Enter the suit: 'c', 'd', 'h', or 's'- u
You did not enter a valid response
Enter the suit: 'c', 'd', 'h', or 's'- c
Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- 2
Enter the suit: 'c', 'd', 'h', or 's'- d
Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- 2
Enter the suit: 'c', 'd', 'h', or 's'- s
Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- 3
Enter the suit: 'c', 'd', 'h', or 's'- s
Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- 3
You already entered that card
Enter the suit: 'c', 'd', 'h', or 's'- h
Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- 3
Enter the suit: 'c', 'd', 'h', or 's'- d
Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- 3
Clubs:	2
Diamonds: 3 2
Hearts:   3
Spades:   3

This is a Full House
Enter 'y' or 'Y' to enter a(nother) hand- g
*/

import java.util.Scanner;
public class PokerHands{

    public static void main(String [] args){
        Scanner scan=new Scanner(System.in); //declare scanner
       
        int [] cardNumbers= new int [52]; //new array with card numbers
    
        for (int i=0; i<cardNumbers.length; i++){
           cardNumbers[i]=i; //assigns values to the array
          
        } 
        int [] hand= new int [5]; //array that holds the hand of cards chosen
        
        System.out.print("Enter 'y' or 'Y' to enter a(nother hand- "); //prompts for continuing/running the program
        String answer= scan.next(); //next string inputted
      
        if (answer.equals("y")|| answer.equals("Y")){ //evaluates response and if it is yes (y or Y) the program continues and if not it does not run
            
        for (int j=0; j<5; j++){ //for loop iterates 5 times for the number of cards in the hand
        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); //prompts user to enter suit
        String suit= scan.next(); //holds the next string which is the options for the suit
        
        System.out.print("Enter one of 'a','k','q','j','10',....'2'- "); //enter rank
        String rank= scan.next(); //holds the next string which is the options for the rank
        
        if (suit.equals("c") && rank.equals("a")){ //these if statements set values to the array hand giving each card type out of 52 (0-51)
            hand[j]= 0;
        }
         else if (suit.equals("c") && rank.equals("k")){
            hand[j]= 1;
        } 
        else if (suit.equals("c") && rank.equals("q")){
            hand[j]= 2;
        }  
        else if (suit.equals("c") && rank.equals("j")){
            hand[j]= 3;
        }  
        else if (suit.equals("c") && rank.equals("10")){
            hand[j]= 4;
        }  
        else if (suit.equals("c") && rank.equals("9")){
            hand[j]= 5;
        }  
        else if (suit.equals("c") && rank.equals("8")){
            hand[j]= 6;
        } 
        else if (suit.equals("c") && rank.equals("7")){
            hand[j]= 7;
        } 
        else if (suit.equals("c") && rank.equals("6")){
            hand[j]= 8;
        } 
        else if (suit.equals("c") && rank.equals("5")){
            hand[j]= 9;
        }  
        else if (suit.equals("c") && rank.equals("4")){
            hand[j]= 10;
        }  
        else if (suit.equals("c") && rank.equals("3")){
            hand[j]= 11;
        } 
        else if (suit.equals("c") && rank.equals("2")){
            hand[j]= 12;
        }  
       
       
        else if (suit.equals("d") && rank.equals("a")){
            hand[j]= 13;
        }
         else if (suit.equals("d") && rank.equals("k")){
            hand[j]= 14;
        } else if (suit.equals("d") && rank.equals("q")){
            hand[j]=15;
        } else if (suit.equals("d") && rank.equals("j")){
            hand[j]=16;
        } else if (suit.equals("d") && rank.equals("10")){
            hand[j]=17;
        } else if (suit.equals("d") && rank.equals("9")){
            hand[j]= 18;
        } else if (suit.equals("d") && rank.equals("8")){
            hand[j]= 19;
        } else if (suit.equals("d") && rank.equals("7")){
            hand[j]= 20;
        }  else if (suit.equals("d") && rank.equals("6")){
            hand[j]= 21;
        } else if (suit.equals("d") && rank.equals("5")){
            hand[j]=22;
        } else if (suit.equals("d") && rank.equals("4")){
            hand[j]= 23;
        } else if (suit.equals("d") && rank.equals("3")){
            hand[j]= 24;
        } else if (suit.equals("d") && rank.equals("2")){
            hand[j]= 25;
        }
        else if (suit.equals("h") && rank.equals("a")){
            hand[j]= 26;
        }
         else if (suit.equals("h") && rank.equals("k")){
            hand[j]= 27;
        } else if (suit.equals("h") && rank.equals("q")){
            hand[j]= 28;
        } else if (suit.equals("h") && rank.equals("j")){
            hand[j]= 29;
        } else if (suit.equals("h") && rank.equals("10")){
            hand[j]= 30;
        } else if (suit.equals("h") && rank.equals("9")){
            hand[j]= 31;
        } else if (suit.equals("h") && rank.equals("8")){
            hand[j]= 32;
        } else if (suit.equals("h") && rank.equals("7")){
            hand[j]= 33;
        } else if (suit.equals("h") && rank.equals("6")){
            hand[j]= 34;
        } else if (suit.equals("h") && rank.equals("5")){
            hand[j]= 35;
        } else if (suit.equals("h") && rank.equals("4")){
            hand[j]= 36;
        } else if (suit.equals("h") && rank.equals("3")){
            hand[j]= 37;
        } else if (suit.equals("h") && rank.equals("2")){
            hand[j]= 38;
        }
        else if (suit.equals("s") && rank.equals("a")){
            hand[j]= 39;
        }
         else if (suit.equals("s") && rank.equals("k")){
            hand[j]= 40;
        } else if (suit.equals("s") && rank.equals("q")){
            hand[j]= 41;
        } else if (suit.equals("s") && rank.equals("j")){
            hand[j]= 42;
        } else if (suit.equals("s") && rank.equals("10")){
            hand[j]= 43;
        } else if (suit.equals("s") && rank.equals("9")){
            hand[j]=44;
        } else if (suit.equals("s") && rank.equals("8")){
            hand[j]= 45;
        } else if (suit.equals("s") && rank.equals("7")){
            hand[j]= 46;
        } else if (suit.equals("s") && rank.equals("6")){
            hand[j]= 47;
        } else if (suit.equals("s") && rank.equals("5")){
            hand[j]= 48;
        } else if (suit.equals("s") && rank.equals("4")){
            hand[j]= 49;
        } else if (suit.equals("s") && rank.equals("3")){
            hand[j]= 50;
        } else if (suit.equals("s") && rank.equals("2")){
            hand[j]= 51;
        }
        
        }
        
       
        
    
    
    
   
    showOneHand(hand); //prints hand
    
        }
    
}


public static void showOneHand(int hand[]){  //method prints the hand
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:     "}; //array with the suits
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ", // array with the ranks
  	"4 ","3 ","2 "};
	String out=""; //
	for(int s=0;s<4;s++){ //iterates 4 times for the suits
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++) //iterates 13 times for the ranks
    	for(int card=0;card<5;card++) //iterates 5 times because there are 5 cards in the hand
     	if(hand[card]/13==s && hand[card]%13==rank) //sets up equations to determine rank and 
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out); //prints out the output
  
    
    int freq []= new int [4]; //gets frequency in an array for the rank
   for (int m=0; m<5; m++){ //iterates 5 times because there are 5 cards in the hand
   
    int temp= hand[m]/13; //uses temp value to store suit 
    freq[temp]+= 1; //adds one each time and uses temp value as index in the freq array
    
    
}

    int freqOfFreq [] = new int [13]; //new array with frequencies of ranks
for (int t=0; t<5; t++){ //iterates 5 times because thats how many cards are in the hand
    int temporary= hand[t]%13; //stores temporary value with rank
    freqOfFreq[temporary]+=1; //adds one each time and uses temporary value as index in the freqOfFreq array
    
    
}






}



}