//Nicolette Dunphy
//HW4
//CSE2
//Month
//due Tuesday 9/23/2014

/* Program that prompts the user to enter an integer for the month
and then displays the number of days in the month.
User must enter an integer in the range (1-12) */

//import scanner class
import java.util.Scanner;

//add class and main method

public class Month {
    //main method
    public static void main(String [] args) {
    
     //declare Scanner object
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //prompt user for number of month
        System.out.print("Enter an int giving the number of the month (1-12)- ");
        
        //declaring variable 'input'
        int input;
       
         //boolean statement to determine month and if its an integer
         if (myScanner.hasNextInt()) { //check if its an integer
             input=myScanner.nextInt();
            if (input>= 1 && input<= 12)  //check if its from 1-12
            {
               if (input == 1 || input == 3 || input == 5 || input == 7 || input == 8 || input == 10 || input == 12) 
               {
               System.out.println("The month has 31 days");
               }
               else if (input == 2)
               {
                   System.out.print("Enter an int giving the year: ");
                   int year= myScanner.nextInt();
               
                    if (year % 4 == 0)//see if its a leap year
                    {
                        System.out.println("The month has 29 days");
                    }
                    else
                    {
                        System.out.println("The month has 28 days");
                    }
               }    
                else if (input == 4 || input == 6 || input == 9 || input == 11)   
                {
                    System.out.println("The month has 30 days");
                    
                }
               
              }
              else
              {
                  System.out.println("You did not enter an int within the range");
              }
         
         }
        else 
        {
            System.out.println("You did not enter an int");
            return;
        }
        
             
         }
    }

             

    