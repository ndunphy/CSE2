//Nicolette Dunphy
//Lab 7
//Loop The Loop
//due Friday 10/10
//Purpose of program: utilize loops and their various functions and have them be interconnected to print various outputs in this program:
//ex. Enter an int between 1 and 15: 3
        //output=
        //***
        //*
        //**
        //***

import java.util.Scanner; //import scanner

public class LoopTheLoop{ //class
    public static void main(String[] arg){ //method
        Scanner myLoop; //scanner
        myLoop= new Scanner (System.in);
        System.out.print("Enter an int between 1 and 15: "); //prompts user for int
     
     if(myLoop.hasNextInt()){ //checks if integer
     
        int input= myLoop.nextInt(); //sets input equal to what user types in
        
        
        if (input>=1&&input<=15){     //checks if in range
        
        int nStars=input; 
        int symbols=1;
       
        while (symbols<=nStars){ //when the number of symbols (1 is added each time) is less than the inputted value it prints out the same number of astericks as the inputt
           System.out.print("*"); //prints * on same line so comes out together
            symbols++; //adds one to symbols each time to print out one more asterick 
            
            
        } //loop
        
       int nAstericks=input;
       int characters=0; //changes variables for new while loop
      
       String result= ""; //starting result
        while (characters<=nAstericks){ //while characters (1 added each time) is less than the inputted value, prints out new asterick string on new lines
            System.out.println(result); //prints result on new lines
            characters++;//adds one to characters each time to print one more *
            result += "*"; //adds one more * after each loop
        }
        }
        else{ System.out.println("Not in range [1,15]");} //prints if not in range
     }
        else{ System.out.println("Not an integer");} //prints if not an integer
        
        
    }
}


