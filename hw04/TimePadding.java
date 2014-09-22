//Nicolette Dunphy
//HW4
//CSE2
//Time Padding
//due Tuesday 9/23/2014

/* Program that has the user enter a positive integer giving
the number of seconds that have passed during the day and then
displays the time in conventional form */

//import scanner class
import java.util.Scanner;

//add class and main method

public class TimePadding {
    //main method
    public static void main(String [] args) {
    
     //declare Scanner object
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //prompt user for time in seconds
        System.out.print("Enter the time in seconds: ");
        
        //declare variables
        int seconds;
        
        if (myScanner.hasNextInt()) 
        {
            seconds= myScanner.nextInt();
            if(seconds>0)
            {
              int hours=(int)((seconds/60.0)/60.0); //gets number of hours
              int seconds1=hours*3600; //converts to seconds
              double minutes=((seconds-seconds1)/60.0); //gets number of minutes with part of a minute as a decimal
              int minutes1=(int)(minutes); //nearest minutes
              double leftoverseconds= (minutes-minutes1)*60; //seconds
              long roundedseconds= Math.round(leftoverseconds); //rounded seconds
            
                if(minutes1>=10 && roundedseconds>=10)
                {
                    System.out.println("The time is "+ hours + ":" + minutes1 + ":" + roundedseconds + ".");
                }
                else if (minutes1<10 && !(roundedseconds<10))
                {
                    System.out.println("The time is "+ hours + ":0" + minutes1 + ":" + roundedseconds + ".");
                }
                else if (!(minutes1<10) && roundedseconds<10)
                {
                    System.out.println("The time is "+ hours + ":" + minutes1 + ":0" + roundedseconds + ".");
                }
                else if (minutes1<10 && roundedseconds<10)
                {
                    System.out.println("The time is "+ hours + ":0" + minutes1 + ":0" + roundedseconds + ".");
                }
            }   
            else 
            {
                System.out.println("You did not enter a positive int");
            }
        }
        else 
        {
            System.out.println("You did not enter an int");
        }
    
    
      }
    
    }
