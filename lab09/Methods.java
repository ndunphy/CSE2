//Nicolette Dunphy
//Lab 9
//due Friday October 24th
//Methods
//Purpose of program: To write three methods to compare two inputted integers and then compare those to another inputted integer, and evaluate whether they are in ascending order

import java.util.Scanner;
public class Methods{
    public static void main(String[] arg){
        System.out.println("Enter three ints");
        Scanner scan=new Scanner(System.in);
        int a, b, c;
       
        a=getInt(scan);
        
        b=getInt(scan);
        
        c=getInt(scan);
        
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+ " is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+ ", and "+c+" are in ascending order");
    
             
     }
       
    public static int getInt(Scanner scan){
      
        System.out.println("Enter an int- ");
     
       Scanner scan1= new Scanner( System.in);
       int myScanner= 0;
       if(scan.hasNextInt()){
       
      
         myScanner= scan.nextInt();
      
    
        return myScanner;
       
    }
    else{
        System.out.println("You did not enter an int! Try again- ");
        String junk= scan.next();
        return getInt(scan);
        
    }
    }
    
    
    public static int larger(int n1, int n2){
        int max=0;
        if (n1>=n2){
            max= n1;
        
            
        }
        else if (n2>=n1) {
            max= n2;
    
        }
        return max;
    }
    
    public static boolean ascending(int a, int b, int c){
        int n3=larger(a, larger(b,c));
        int n2=larger(a,b);
        int n1=a;
        
       boolean order=true;
       
        if (n1==a&& n2==b && n3==c){
            order= true;
        }
        else {
           order=false;
        }
        
        return order;
       
    }
    
  
       
        
    
}
