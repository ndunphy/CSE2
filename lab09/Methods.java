//Nicolette Dunphy
//Lab 9
//due Friday October 24th
//Methods
//Purpose of program: To write three methods to compare two inputted integers and then compare those to another inputted integer, and evaluate whether they are in ascending order

import java.util.Scanner; //import scanner
public class Methods{ //class methods
    public static void main(String[] arg){ //main method
        System.out.println("Enter three ints"); //prompt user
        Scanner scan=new Scanner(System.in); //declare/initialize scanner
        int a, b, c; //declare a,b,c
       
        a=getInt(scan); //initialize a,b,c as the integers from the method getInt()
        
        b=getInt(scan);
        
        c=getInt(scan);
        
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b)); //print largest of first two integers
        System.out.println("The larger of "+a+", "+b+", and "+c+ " is "+larger(a,larger(b,c))); //largest of all integers
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+ ", and "+c+" are in ascending order"); //evaluating validity of ascending order in order from smallest to biggest
    
             
     }
       
    public static int getInt(Scanner scan){ //getInt method
      
        System.out.println("Enter an int- "); //prompt user
     
       Scanner scan1= new Scanner( System.in); //scanner object
       int myScanner= 0; //declare and initialize myScanner
       if(scan.hasNextInt()){ //test input as an integer
       
      
         myScanner= scan.nextInt();
      
    
        return myScanner; //return value inputted into scanner
       
    }
    else{ //if not an integer print error and have user enter another int
        System.out.println("You did not enter an int! Try again- ");
        String junk= scan.next();
        return getInt(scan);
        
    }
    }
    
    
    public static int larger(int n1, int n2){ //larger method
        int max=0; //initialize and declare max
        if (n1>=n2){ //if the first number is larger that is the max
            max= n1; //n1 is set as max
        
            
        }
        else if (n2>=n1) { //if second number is larger that is the max
            max= n2; //n2 is set as max
    
        }
        return max; //return the value of the max
    }
    
    public static boolean ascending(int a, int b, int c){ //ascending method
        int n3=larger(a, larger(b,c)); //set n3 to largest number of three
        int n2=larger(a,b); //set n2 to second largest number
        int n1=a; //set n1 to remaining number
        
       boolean order=true; //initialize and declare order
       
        if (n1==a&& n2==b && n3==c){ //if the value of the largest integer is a, second largest is b, and last is c then the boolean is true
            order= true; //sets order to true
        }
        else { //if its not in that order
           order=false; //order is set to false
        }
        
        return order; //the value of order (true or false) is returned
       
    }
    
  
       
        
    
}
