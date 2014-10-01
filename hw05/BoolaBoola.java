//Nicolette Dunphy
//CSE2
//Homework 5
//Boola Boola
//due Tuesday 9/30

/*Program has three boolean variables to each of which the value of true or false is
randomly assigned. Then at random, the three variables are combined and the result is
stored. User states result and either correct or wrong appears depending on the input*/

//import scanner class
import java.util.Scanner;

//class
public class BoolaBoola{
    //main method
    public static void main(String[] args){
        
        //declare Scanner object
        Scanner myScanner;
        myScanner= new Scanner ( System.in );
        
        //declares variables for random t/f assignment
        int boolean1= (int)(Math.random()*(2));
        int boolean2= (int)(Math.random()*(2));
        int boolean3= (int)(Math.random()*(2));
        int statement= (int)(Math.random()*(4))+1; //randomly assigns one of four possible statements
        
        
        boolean x1=true; //initiates variables
        boolean x2=true; 
        boolean x3=false;
        
      
        
        switch(boolean1){ //switch for when boolean1 randomly evaluates to either true or false
            case 0: //if random integer from 0 to 1 is 0
            x1= true; //changes value to true
            break;
            case 1: //if 1
            x1= false; //changes value to false
            break;
            }
            
        switch(boolean2){ //switch for when boolean2 randomly evaluates to either true or false
            case 0: //if 0
            x2= true; //changes value to true
            break;
            case 1: //if 1
            x2= false; //changes value to false
            break;
            }
            
        switch(boolean3){//switch for when boolean3 randomly evaluates to either true or false
            case 0: //if 0
            x3= true; //changes value to true
            break;
            case 1: //if 1
            x3= false; //changes value to false
            break;
            
        }
          boolean b1 = x1||x2||x3; //four possible operator combinations
         boolean b2 = x1||x2&&x3;
         boolean b3 = x1&&x2||x3;
          boolean b4 = x1&&x2&&x3; 
          
           
           String input=" "; //initializes input variable
           
         
       
        switch(statement){ //switch for statement possibilities
            case 1: //if 1
            System.out.print("Does "+x1+" || "+x2+" || "+x3+  " have the value true (t/T) or false (F/f)? "); //prompts user
            input= myScanner.next();
            if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){  //makes sure valid response
             if (input.equals("t")||input.equals("T")&&b1==true){ //checks validity of input
         System.out.println("Correct!");} //prints Correct if correct
        else if(input.equals("f")||input.equals("F")&&b1==false){ //checks validity of input
            System.out.println("Correct!");} //prints Correct if correct
        
        
        else {
        System.out.println("Sorry you are incorrect! Try again!"); //if not input is wrong
     }}
            else {
        System.out.println("Not an answer option! Please type t, T, f, or F!"); //incorrect input was put in
    }
           
            break;
            
            case 2: //if 2
            System.out.print("Does "+x1+" || "+x2+" && "+x3+  " have the value true (t/T) or false (F/f)? "); //prompts user
            input= myScanner.next();
         if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){     //checks correct form of response 
            if (input.equals("t")||input.equals("T")&&b2==true){ //checks validity of input
         System.out.println("Correct!");} //prints Correct if correct
        else if(input.equals("f")||input.equals("F")&&b2==false){ //checks validity of input
            System.out.println("Correct!");} //prints Correct if correct
        
        
        else {
        System.out.println("Sorry you are incorrect! Try again!"); //if not prints that input was wrong
     }}
        else {
        System.out.println("Not an answer option! Please type t, T, f, or F!"); //prints if input is not one of correct options
    }
            
            break;
            
            case 3: //if 3
             System.out.print("Does "+x1+" && "+x2+" || "+x3+  " have the value true (t/T) or false (F/f)? "); //prompts user
             input= myScanner.next();
        
            if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){  //possible input options
             if (input.equals("t")||input.equals("T")&&b3==true){ //checks validity of input
         System.out.println("Correct!");} //if correct prints Correct
        else if(input.equals("f")||input.equals("F")&&b3==false){ //checks validity of input
            System.out.println("Correct!");} //if correct prints Correct
        
        
        else {
        System.out.println("Sorry you are incorrect! Try again!"); //if not correct then prints wrong
     }}
        else {
        System.out.println("Not an answer option! Please type t, T, f, or F!"); //prints if one of possible options arent inputted
    }
            
          break;
            case 4: //if 4
            System.out.print("Does "+x1+" && "+x2+" && "+x3+  " have the value true (t/T) or false (F/f)? "); //prompts user
            input= myScanner.next();
         
          if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){    //possible inputs
              if (input.equals("t")||input.equals("T")&&b4==true){ //checks validity
         System.out.println("Correct!");} //prints Correct if correct
        else if(input.equals("f")||input.equals("F")&&b4==false){ //checks validity
            System.out.println("Correct!");} //prints correct if correct
        
        
        else {
        System.out.println("Sorry you are incorrect! Try again!"); //prints incorrect if does not validate as correct
     }}
        else {
        System.out.println("Not an answer option! Please type t, T, f, or F!"); //prints if not one of the possible inputs
    }
            
            break;
            
        }
      
         }    
      
   
   
     
     
    }

       

        

    