//Nicolette Dunphy
//CSE2
//Homework 5
//Burger King
//due Tuesday 9/30

//Program  prompts user to enter a choice of a burger, a soda, or fries.
//Then the program prompts the users for details of their choices.

//import scanner class
import java.util.Scanner;

//class
public class BurgerKing{
    //main method
    public static void main(String[] args){
        
        //declare Scanner object
        Scanner myScanner;
        myScanner=new Scanner( System.in );
        
        //prompt user for choice of burger, soda, or fries
        System.out.print("Enter a letter to indicate a choice of: Burger (B or b), Soda (S or s), Fries (F or f): ");
            
        //declare input
        String input;
        input= myScanner.next();
        
        if(input.length()>1){ //if more than one letter is inputed
            System.out.println("Single character expected.");
        }
        else{ //if only one character is used...proceed with rest of code
        
        
        switch(input){
            case "B": //if user types "B"
                System.out.print("Enter A or a for all the fixins," +
               " C or c for cheese," + " or N or n for none of the above: "); //new user prompt for toppings
              String toppings= myScanner.next();
                switch(toppings){
                    case "A": //if user enters "A"
                         System.out.println("You ordered a burger with all the fixins");
                         break;
                    case "a": //if user enters "a"
                         System.out.println("You ordered a burger with all the fixins");
                         break;
                    case "c": //if user enters "c"
                         System.out.println("You ordered a burger with cheese.");
                         break;
                    case "C": //if user enters "C"
                         System.out.println("You ordered a burger with cheese.");
                         break;
                    case "n": //if user enter "n"
                         System.out.println("You ordered a plain burger.");
                         break;
                    case "N": //if user enters "N"
                         System.out.println("You ordered a plain burger.");
                         break;
                }
                break;
            case "b": //if user types "b"
                System.out.print("Enter A or a for all the fixins," +
               " C or c for cheese," + " or N or n for none of the above: "); //new user prompt for toppings
                toppings= myScanner.next();
                switch(toppings){
                    case "A": //if user enters "A"
                         System.out.println("You ordered a burger with all the fixins");
                         break;
                    case "a": //if user enters "a"
                         System.out.println("You ordered a burger with all the fixins");
                         break;
                    case "c": //if user enters "c"
                         System.out.println("You ordered a burger with cheese.");
                         break;
                    case "C": //if user enters "C"
                         System.out.println("You ordered a burger with cheese.");
                         break;
                    case "n": //if user enter "n"
                         System.out.println("You ordered a plain burger.");
                         break;
                    case "N": //if user enters "N"
                         System.out.println("You ordered a plain burger.");
                         break;
                    
                }
                break;
            case "s": //if user types "s"
                System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m)-");
                String soda= myScanner.next();
                switch(soda){
                    case "p"://if user types "p"
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "P"://if user types "P"
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "c"://if user types a "c"
                        System.out.println("You ordered a Coke");
                        break;
                    case "C": //if user types "C"
                        System.out.println("You ordered a Coke");
                        break;
                    case "M": //if user types "M"
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m": //if user types "m"
                        System.out.println("You ordered a Mountain Dew");
                        break;
    
                }
                break;
            case "S": //if user types "S"
                System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m)-");
                soda= myScanner.next();
               
                switch(soda){
                    case "p"://if user types "p"
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "P"://if user types "P"
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "c"://if user types a "c"
                        System.out.println("You ordered a Coke");
                        break;
                    case "C": //if user types "C"
                        System.out.println("You ordered a Coke");
                        break;
                    case "M": //if user types "M"
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m": //if user types "m"
                        System.out.println("You ordered a Mountain Dew");
                        break; }
                        break;
            case "F": //if user types "F"
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)-");
                String fries=myScanner.next();
                switch (fries){
                    case "l": //user types "l"
                        System.out.println("You ordered large fries.");
                        break;
                    case "L"://user types "L"
                        System.out.println("You ordered large fries.");
                        break;
                    case "s": //user types "s"
                        System.out.println("You ordered small fries.");
                        break;
                    case "S": //user types "S"
                        System.out.println("You ordered small fries.");
                        break;
                }
                        break;
            case "f": //if user types "f"
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)-");
                fries=myScanner.next();
                switch (fries){
                    case "l": //user types "l"
                        System.out.println("You ordered large fries.");
                        break;
                    case "L"://user types "L"
                        System.out.println("You ordered large fries.");
                        break;
                    case "s": //user types "s"
                        System.out.println("You ordered small fries.");
                        break;
                    case "S": //user types "S"
                        System.out.println("You ordered small fries.");
                        break;
                }
                        break;
           default: //if none of the options are entered
                System.out.println("You did not enter any of B,b,s,S,F,or f.");
                
        }    
        }
                       
            
            
        }
    }
