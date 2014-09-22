//Nicolette Dunphy
//HW4
//CSE2
//Course Number
//due Tuesday 9/23/2014

/* Program that reads in a 6 digit number adhering to proper requirements and prints
out the semester and year */

//import scanner class
import java.util.Scanner;

//add class and main method

public class CourseNumber {
    //main method
    public static void main(String [] args) {
    
     //declare Scanner object
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //prompt user for course number
        System.out.print("Enter a six digit number giving the course semester- ");
        
        //declare input
        int input;
        int year;
        int semester;
        
       
        
        //boolean statement to determine if digit is wihtin the range and to determine the semester and year
        if (myScanner.hasNextInt()) //check if integer
        {
        //initialize input as the scanner input
        input= myScanner.nextInt();
          if (input<= 1186510 && input>= 201440)
         {
          System.out.println ("The number was outside the range [186510,201440]");   
         }
         else {
             
           year= (int)(input/100.0);
            semester= input - (year*100);
            
            if (semester == 10)
                {
                   System.out.println("The course was offered in the Spring semester of "+year); 
                }
            else if (semester == 20)
                {
                    System.out.println("The course was offered in the Summer 1 semester of "+year);
                }
            else if (semester == 30)
                {
                    System.out.println("The course was offered in the Summer 2 semester of "+year);
                }
            else if (semester == 40)
            {
                System.out.println("The course was offered in the Fall semester of "+year);
            }
         }
        }
         else 
         {
             System.out.println("The number given was not an int");
             return;
        }
    
        
    }
}