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
        System.out.print("Enter 'y' or 'Y' to enter a(nother hand- ");
        
        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
        
        System.out.print("Enter one of 'a','k','q','j','10',....'2'- ");
    
        
    }




public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:     "};              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }

}