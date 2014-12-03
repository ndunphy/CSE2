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
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
   int n=3;
    if(scan.hasNextInt()){
       n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
       n=4;
      System.out.println("You entered "+n);
    }
    
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}



/* Error report:

      -line 32: n was not initialized is the compiler error but n needs to just be taken out of this list bc it has been defined from the beginning
      -initialized and declared n outside of if statement
      -took out the 'int' declarations from line 24 and 20

 */

