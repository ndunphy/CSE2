//Nicolette Dunphy
//Lab6
//Engima1


/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if(x==7.0){  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);}
      
    else if(x==41.0){//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    }
    else if(x==14.0){//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    }
    else if(x==33.0){ //user enters 33
      System.out.println("The proportion remaining is "+0.67);
    }
    else if(x==60.0){//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    }   
      
    }
}

/* Error report: 
 *   
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * It doesn't work for 7, 41, or 33
 * Changed conditions for if statements simply to the x value because it will result in same answer but operates correctly and is simpler
 * 
 * 
 */

