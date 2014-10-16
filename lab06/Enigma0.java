//Nicolette Dunphy
//Enigma0
//Lab6

//Purpose: Debug the given code

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    
    
    Scanner scan;
    scan=new Scanner(System.in);
   
    
    System.out.print("Enter an int- ");
     int n;
    n=scan.nextInt(); //moved to after scanner and after prompt
     //has to be after scanner
    //took out of if statement
    
    if(scan.hasNextInt()){
      
      System.out.println("You entered "+n);
    }
    else{
      n=4; //took out "int"
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8; //took out n
    
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */

