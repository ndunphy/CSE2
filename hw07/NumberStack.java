//Nicolette Dunphy
//HW7
//NumberStack
//Due October 21st
//Purpose of Program: To use for, while and do-while loops to print out a specific
//display after the user inputs an integer

import java.util.Scanner; //import Scanner

public class NumberStack{ //class
    public static void main(String[] arg){ //main method
        
        Scanner numberInput=new Scanner(System.in); //declar scanner and initialize it
        
       
        System.out.print("Enter a number between 1 and 9: " ); //prompts user to enter integer
         
          int input= numberInput.nextInt(); //sets input equal to the integer entered by user
         if(input>=1 && input<=9){ //tests if in the interval
       
         int j=0; //initializes variables
         int n=0;
         int m=0;
         int k=0;
         int z=input;
         int c=0;
         
         for (j=1; j<=input; j++){ //runs the number of times equal to the inputted integer (lines)
             
             for(n=1; n<=j; n++){ //runs the same amount of times as previous loop (lines)
                 
                 for(c=1; c<=z; c++){ //
                     
                     
                    System.out.print (" ");
                 }
                 for(m=1; m<=(2*j-1); m++){ //runs 2* the input minus one times. prints the integer
                     
                     
                    System.out.print (j);
                 }
                    System.out.println(); //puts the dashes on the next line
                    
                }
                 for(c=1; c<=z; c++){ //
                     
                     
                    System.out.print (" ");
                 }
                for(k=1; k<=2*j-1; k++){ //runs 2*input minus one times. prints the dashes
                System.out.print("-");
                
                }
                System.out.println(); //prints next thing on a new line
                z--;
             
         }

        j=1; //initalizes j
        z=input;
         while (j<=input){ //runs as long as j is less than the inputted integer
             n=1; //initializes n
             while(n<=j){ //runs as long as n is less than or equal to j
                 c=1; //initializes m
                
                while(c<=z){
                 System.out.print(" ");   
                 c++;
                }
                 m=1;
                 while(m<=(2*j-1)){ //runs as long as m is less than 2*j-1
                     
                     
                    System.out.print (j); //prints integers
                    m++; //increments m
                 }
                    System.out.println(); //prints on next line
                  n++;  //increments n
                }
                c=1;
                while(c<=z){
                    System.out.print(" ");
                    c++;
                }
                k=1; //intializes k
                while(k<=2*j-1){ //runs as long as k is less than or equal to 2*j-1
                System.out.print("-"); //prints the dashes
                k++; //increments k
                }
                System.out.println(); //prints on next line
                j++; //increments j
                z--;
             
         }
         
               j=1; //initializes j
        z=input;
        do{ 
             n=1; //initializes n
             do{
                c=1; 
                do{
                     System.out.print(" ");
                     c++;
                 }while(c<=z);
                 m=1; //initializes m
                
                 do{
                     
                     
                    System.out.print (j); //prints integers
                    m++; //increments m
                 }while(m<=(2*j-1)); //runs this until m is not less than or equal to 2*j-1
                    System.out.println(); //prints next thing on next line
                  n++;  //increments n
                } while(n<=j); //runs this until n is not less than or equal to j
                c=1;
                do{
                     System.out.print(" ");
                     c++;
                 }while(c<=z);
                k=1; //initializes k
                do{
                System.out.print("-"); //prints the dashes
                k++; //increments k
                }while(k<=2*j-1); //runs this until k is not less than or equal to 2*j-1
                System.out.println();//prints next thing on next line
                j++;//increments j
                z--; //decrements z
        } while (j<=input); //runs this until j is not less than or equal to the inputted value from user
        
    }
    
         else{
             System.out.println("You did not enter an integer in the interval. Try again!"); //if inputted number is not in the interval this error will print
         }
         
    }
}