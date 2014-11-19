//Nicolette Dunphy
//HW10
//Find Duplicates
//Purpose of program: After 10 ints are entered the program evaluates whether there are duplicates or not

/* Sample Output:

Enter 10 ints- 1 23 1 3 4 5 6 7 8 9 
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has duplicates.
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 3 4 5 6 7 8 9 0
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have duplicates.
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 1 2 3 4 5 8 9 7
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} has duplicates.
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- n
*/


import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }

    public static boolean hasDups(int [] num){
        boolean result=false; //initialize and declare as false so if the if statement is not initialized result doesn't change from false
        for (int i=0; i<num.length; i++){ //iterates for as many values as there are in the array
          for (int k=i+1; k<num.length; k++){ //iterates at one more than the index value of the first loop
          
            if (num[i]==num[k]){ //checks to see if the values of the array indexes are equal
              result=true; //changes result to true
              break; //breaks out of for loop
            }
        
          }
        }
          return result; //returns the value of result (true if there are duplicates or false if not)
        
    }
    
    public static boolean exactlyOneDup(int [] num){
        boolean result=false; //initialize and declare as false so if the if statement is not initialized result doesn't change from false
        int counter=0;
        for (int i=0; i<num.length; i++){ //iterates for as many values as there are in the array
          for (int k=i+1; k<num.length; k++){ //iterates at one more than the index value of the first loop
          
            if (num[i]==num[k]){ //checks to see if the values of the array indexes are equal
             counter++; //adds one to a counter which adds up the number of duplicates
              
            }
        
          }
        }
          if (counter==1){ //if the counter is 1 (there is only one duplicate)
            result=true; //result is true
          } 
          else { //if there is either no duplicates or more than 1
            result=false; //result is set to false
          }
          return result; //returns the value of result (true if there is exactly one duplicate or false if not)
        
        
        
    }
    
    
    
    
}
