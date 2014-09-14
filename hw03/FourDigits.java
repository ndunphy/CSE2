//Nicolette Dunphy
//CSE2
//HW3
//FourDigits
//due 9/16/14

//Program promts the user to enter a double and then prints out the first four digits
//to the right of the decimal point

//import Scanner class
import java.util.Scanner;

//define a class
public class FourDigits{
    
    //add a main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
            myScanner= new Scanner (System.in );
         System.out.print("Enter a double, and I display the four digits to the right of the decimal point:"); //inputs double and prints first 4 digits after decimal
         
        double myDouble= myScanner.nextDouble () ;
        
        int fourDigits=(int)(myDouble*10000); //calculates inputed number*10000 and cuts off other decimal places
        int digit4= fourDigits%10; //gets last digit by getting remainder when number is divided by 10
        int threeDigits= (int)fourDigits/10; //cuts off digit that was just found
        int digit3= threeDigits%10; //gets second to last digit by getting remainder of this number when divided by 10
        int twoDigits= (int)threeDigits/10; //cuts off digit just found
        int digit2= twoDigits%10; //gets third to last digit by getting remainder of number when divided by 10
        int oneDigit= (int)twoDigits/10; //cuts off digit
        int digit1= oneDigit%10; //gets first digit by getting remainder of number when divided by 10
        

        //output
        
        System.out.println ("The four digits are "+digit1+digit2+digit3+digit4);
        
    }
}