//Nicolette Dunphy
//HW9
//Blocked Again
//Purpose of Program: Address subprograms using methods and break program into these problems that will all be put together at the end

/*Expected behavior:
Enter an in int between 1 and 9, inclusive: t
You did not enter an int; try again: 90
You did not enter an int in [1,9]; try again: 4

   1
   -
  222
  222
  ---
 33333
 33333
 33333
 -----
4444444
4444444
4444444
4444444
------- */

import java.util.Scanner; //import scanner

public class BlockedAgain{ //class

    public static void main(String []s){ //main method
    int m;//force user to enter int in range 1-9, inclusive.
     Scanner scan= new Scanner( System.in); //scanner object
    m = getInt(); 
   allBlocks(m);
    }
    
    public static int getInt(){ //calls checkInt and checkRange
       System.out.print("Enter an int between 1 and 9, inclusive: "); //prompt user
       Scanner scan1= new Scanner( System.in); //scanner object
      int answer=  checkInt(scan1); //calls method checkInt
      int answer1= checkRange(answer);
      return answer1;
    
        }
       
    
    
    public static int checkInt(Scanner scan) { //checks if input is an integer
         
    
         if(scan.hasNextInt()){ //test input as an integer
             int integer= scan.nextInt();
      
    
                 return integer; //return value inputted into scanner
       
         }
         else{ //if not an integer print error and have user enter another int
         System.out.print("This is not an int. Try again! Enter an int between 1 and 9, inclusive: "); //prompt user
            scan.next(); //scanner
         }
        int answer=scan.nextInt();
            checkInt(scan); //check again

        
        return answer;
    }
    
    
    
    
    public static int checkRange(int integer) { //checks if input is within range [1,9]
      
        
        int answer=0;
        if (integer>0 && integer<10){ //if it is in the range then return true
            answer=integer;
            return answer; //returns the correctly formatted input
        }
        else{
             System.out.print("This is not in the range! Try again!: "); //prompt
            answer=getInt();//call getInt again
            return answer; //returns the scanner again so you can try again
        }
    
    }
    
   public static void allBlocks(int m){ //allBlocks method
        block(m); //calls block which calls line inside of it
        
       
   }
    
    public static void block(int m){ //runs method with input as m
                  
        
                for(int q=1; q<m+1; q++){
                
                 for(int c=0; c<q; c++){
                    
                    for(int k= m; k>q; k--){ 
                System.out.print(" ");
                
                }
                for (int z=0; z<q-1; z++){
                    System.out.print(q + "" +q);
                }
                    System.out.println(q); //prints numbers
                 }
                for(int u=m; u>q; u--){ //spacing with numbers centered
                    System.out.print(" "); //spaces
                }
                    line(q); //runs line with variable q
                    
                }
        
    }
    
    public static void line(int q){ //does dashes
        
        
          for (int b=0; b<q-1; b++){ //runs the number of times equal to q-1 (lines)
             
            
                     
                    System.out.print("--"); //dashes
                 }
               
                    System.out.println("-"); //puts the dashes on the next line
                    
                }
        
    


       
         
      
         }
         
         
       