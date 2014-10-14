//Nicolette Dunphy
//HW6
//Root
//Purpose of this program: Compute the square root of a number based on user input

import java.util.Scanner; //import scanner

public class Root{
    public static void main(String[] arg){
        
        Scanner myScanner; //declaring scanner
        myScanner= new Scanner(System.in); //defining
       
     System.out.print("Enter a double greater than 0: "); //prompts user
        
        double input= myScanner.nextDouble(); //setting input equal to value user inputs
        
       
        
        
        double low=0.0; //low value
        double high=1.0+input; //high value
        double middle=0.0; //initializing middle
        
        
        if (input>0){ //checks input
        while ((high-low)>(0.0000001*(1+input))){
        middle= (high+low)/2.0; 
        
        if ((middle*middle)>input){ //if middle squared is more than the input
            high=middle; //high equal to middle
        }
        else {
            low=middle; //low equal to middle if not
        }
        if ((high-low)>(0.0000001*(1+input))){
            //needed to be able to print an answer
        }
        else {
            System.out.println("The square root is "+middle); //answer
        }
            
        }
        
        }
        else { 
            System.out.println("You did not enter a double greater than 0"); //error message for input
        }
        
    }
}