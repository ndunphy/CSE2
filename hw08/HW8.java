//Nicolette Dunphy
//HW8
//Purpose of Program: practice in writing methods, overloading methods, and in forcing the user to enter good input. 

import java.util.Scanner; //import scanner
public class HW8{ //class HW8
  public static void main(String []arg){ //main method
	char input; //input is set as a character value
	Scanner scan=new Scanner(System.in); //declare scanner
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //prompt user
	
	input=getInput(scan,"Cc"); //calls a method to get the input
	System.out.println("You entered '"+input+"'"); //print out the input entered
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //prompt user to enter Y y n or N
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input!=' '){ //if something is entered
   	System.out.println("You entered '"+input+"'"); //print the input
	}
	
	input=getInput(scan,"Choose a digit.","0123456789"); //calls method to choose a digit out of 0-9
	System.out.println("You entered '"+input+"'"); //prints the input
  }  

    public static char getInput( Scanner scan, String x ){ //method of getInput to get the inputted value
      if (x.length()>0){
       char c1=x.charAt(0); //1st character of string ("C")
       char c2=x.charAt(1); //2nd character of string ("c")
       scan=new Scanner(System.in);
       String input= scan.nextLine(); //takes in a string
       char i1=input.charAt(0);//takes 1st letter of input
     
      if (input.length()==1){
       if(i1==c1)
       { //if the 1st inputted character is equal to character 1 (C)
          
           return c1; //return that value
       }
       else if (i1==c2)//if the 1st inputted character is equal to character 2 (c)
       { 
           return c2; //return that value
       }
      }
        else { //if more than one character entered
            System.out.println("You should enter exactly one character. Enter 'C' or 'c' to continue. Try again- ");
            return getInput(scan, x); //reruns
        }
      }
      
    System.out.print("You did not enter a characer from the list 'Cc' try again- "); //if C or c is not entered
    return getInput(scan,x); //reruns
        
    }
        
    
   public static char getInput( Scanner scan1, String p, int n){
       int t=0;
       while(t<n){ //only 5 tries to attempt
           
           char c1= p.charAt(0); //1st character of string p
           char c2=p.charAt(1); //2nd character of string p
           char c3=p.charAt(2); //3rd characer of string p
           char c4= p.charAt(3); //4th character of string p
           
           scan1= new Scanner(System.in);
           String input= scan1.nextLine();
           
           char i1= input.charAt(0); //1st character of input
           
           if (input.length()==1) //checks if input is one character long
           {
               if (i1==c1) //if 1st input= y
               {
                   return c1; //retun y
               }
               else if (i1==c2) //if 1st input=Y
               {
                   return c2; //return Y
               }
               else if (i1==c3) //if 1st input=n
               {
                   return c3; //return n
               }
               else if (i1==c4) //if 1st input=N
               {
                   return c4; //return N
               }
               else {
                   System.out.print("You did not enter a character from the list. Try again. Enter 'yYnN' Try again- " );
                   return getInput(scan1, p, n);
               }
               
           }
           else {
               System.out.print("You did not enter exactly one character. Try again- ");
               
           }
           
           
         t++;  
       }
        System.out.println("You failed after 5 tries");
        return getInput(scan1, p, n);
       
        
   }
        
        
   
    
   public static char getInput( Scanner scan2, String k, String j){
        System.out.println("Choose a digit");
        System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', or '9': ");
        
        char c1= j.charAt(0); //1st character of string of digits
        char c2= j.charAt(1); //2nd character of string of digits
        char c3= j.charAt(2); //3rd character of string of digits
        char c4= j.charAt(3); //4th character of string of digits
        char c5= j.charAt(4); //5th character of string of digits
        char c6= j.charAt(5); //6th character of string of digits
        char c7= j.charAt(6); //7th character of string of digits
        char c8= j.charAt(7); //8th character of string of digits
        char c9= j.charAt(8); //9th character of string of digits
        char c10= j.charAt(9); //10th character of string of digits
        
        scan2= new Scanner(System.in);
        String input=scan2.nextLine();
        
        char i1=input.charAt(0); //1st character of input
        
        if(input.length()==1){ //if input is one check the inputs
            if (i1==c1){ //if input is equal to the first digit of string print that digit ,etc. for every digit
                return c1;
            }
            else if (i1==c2){
                return c2;
            }
           else if (i1==c3){
                return c3;
            }
            else if (i1==c4){
                return c4;
            }
           else if (i1==c5){
                return c5;
            }
            else if (i1==c6){
                return c6;
            }
           else if (i1==c7){
                return c7;
            }
            else if (i1==c8){
                return c8;
            }
           else if (i1==c9){
                return c9;
            }
           else if (i1==c10){
                return c10;
            }
            else { //if it doesn't match any of the digits
                System.out.print("You did not choose one of the digits. Try again!- ");
                return getInput(scan2,k,j); //re run!
            }
            
        }   
        else { //if its more than one character
            System.out.print("You entered more than one character. Try again!- ");
            return getInput(scan2,k,j); //re run
        }
            
    
     
    }

    
}
