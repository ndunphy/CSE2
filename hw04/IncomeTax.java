//Nicolette Dunphy
//HW4
//CSE2
//Income Tax
//due Tuesday 9/23/2014

/*Program prompts user to enter an int that gives the thousands
of dollars of income and then writes out the amount of tax on the income */

//import scanner class
import java.util.Scanner;

//add class and main method

public class IncomeTax {
    //main method
    public static void main(String [] args) {
    
        //declare Scanner object
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //prompt user for income in thousands
        System.out.print("Enter an int giving the number of thousands of income- ");
        
         //declare income variable and tax rates
        int income;
        double tax1= .05;
        double tax2= .07;
        double tax3= .12;
        double tax4= .14;
        
         
        //boolean statement to determine class of tax and to test for integer
         if (myScanner.hasNextInt()) {
           income= myScanner.nextInt();
             if (income>0)
             { 
                 if (income<20) {
                System.out.println("The tax rate on $"+ income+",000 is 5.0%, and the tax is $"+ (int)(tax1*(income*1000)*100)/100.0);
                 }
                else if (income>=20 && income<40) {
                System.out.println("The tax rate on $"+ income+",000 is 7.0%, and the tax is $"+ (int)(tax2*(income*1000)*100)/100.0);
                }
                else if (income>=40 && income<78) {
                System.out.println("The tax rate on $"+ income+",000 is 12.0%, and the tax is $"+ (int)(tax3*(income*1000)*100)/100.0);
                }
                else if (income>=78){
                System.out.println("The tax rate on $"+ income+",000 is 14.0%, and the tax is $"+ (int)(tax4*(income*1000)*100)/100.0);
                }
            
         }
             else
             {
                 System.out.println("You did not enter a positive int.");
             }
         }      
         else
         {
            System.out.println ("You did not enter an int");
            return;
        }
         
  } //end of main method
} //end of class
        