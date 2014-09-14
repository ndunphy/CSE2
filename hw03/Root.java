//Nicolette Dunphy
//CSE2
//HW3
//Root
//due 9/16/14

//Program prompts user to enter a double and then prints out a
//crude estimate of the cube root of the number and the value of this crude guess when cubed

//import Scanner class
import java.util.Scanner;

//define a class
public class Root{
    
    //add a main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
            myScanner= new Scanner (System.in );
         System.out.print("Enter a double, and I print its cube root: ");//user inputs integer that they want to find cubed root of
    
        int x= myScanner.nextInt () ;
        
        double guess = x/3; //makes guess equal to the selected integer/3
        double guess1 = (guess*guess*guess+x)/(3*guess*guess);//reassigns value to guess
        double guess2 = (guess*guess*guess+x)/(3*guess*guess);//reassigns value to guess
        double guess3 = (guess*guess*guess+x)/(3*guess*guess);//reassigns value to guess
        double guess4 = (guess*guess*guess+x)/(3*guess*guess);//reassigns value to guess
        double guess5 = (guess*guess*guess+x)/(3*guess*guess);//reassigns value to guess
        
       
       //output
        System.out.println ("The cube root is "+guess5+":");
        System.out.println (guess5+"*"+guess5+"*"+guess5+"= "+(guess5*guess5*guess5));
        
    }
}
