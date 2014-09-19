//Nicolette Dunphy
//CSE2
//Lab 4
//Big Mac Again
//due 9/19/14

//Program that uses the Scanner class to obtain from users how many Big Macs they want
//and whether they want an order of fries. It then prints out the total cost of the meal.
//Big Macs still cost $2.22 each,
//and an order of fries costs $2.15.

//import scanner class
import java.util.Scanner;

//add class and main method

public class BigMacAgain {
    //main method
    public static void main(String [] args) {
        
        //declare Scanner object
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //prompt user for number of Big Macs
        System.out.print("Enter the number of Big Macs: ");
        
        
        //declare nBigMacs
        int nBigMacs;
        
        double costBigMac= 2.22;
        
        
   
        //boolean statement
        double totalBigMacCost =0;
        if (myScanner.hasNextInt()) {
            nBigMacs= myScanner.nextInt();
            totalBigMacCost= (int)((nBigMacs*costBigMac)*100)/100.0;
            System.out.println("You ordered " + nBigMacs +" Big Macs for a cost of " + nBigMacs+"*" + costBigMac + "= $" + totalBigMacCost);
        } 
        else{
            System.out.println ("You did not enter an int");
            return;
        }
        //Ask whether user wants french fries
        System.out.print("Do you want an order of french fries (Y/y/N/n)?");
        String fries= myScanner.next();
       
       
       
        //set fries cost
        double friesCost= 2.15;
        //boolean statement to evaluate response
        if (fries.equals("Y") || fries.equals("y") || fries.equals("n") || fries.equals("N") ){
            if (fries.equals("Y") || fries.equals("y") ){
                System.out.println("You ordered fries at a cost of $2.15");
                System.out.println("The total cost of the meal is $ "+ ((int)(totalBigMacCost*100))/100.0);
                }
            else {
                System.out.println("The total cost of the meal is $ " + totalBigMacCost);
                }
             }
        else {
            System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
            return;
        }
        
        
    } //end of main method
} //end of class