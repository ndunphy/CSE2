//Nicolette Dunphy
//Lab 11
//Arrays
//Purpose of program: Perform elementary operations with arrays

import java.util.Scanner; //import scanner

public class Arrays{ //class
    
    public static void main(String[] args){ //main method
    
        System.out.print("Enter 10 ints: "); //prompts user for 10 ints
        Scanner scan=new Scanner(System.in);
        
        int [] tenInts; //create array
        tenInts= new int [10]; //makes it so array can hold 10 ints
        
        for(int i=0; i<10; i++){    //making user inputs the array values
            tenInts[i]= scan.nextInt();
        }
        

        //min
       
        int min=tenInts[0];
        for (int i=1; i<10; i++){
        	if (tenInts[i] < min){
        	min= tenInts[i];
        //	index=i;
            }
        }
            System.out.println("The lowest entry is: "+min);
        
        
        //max
        
        int max=tenInts[0];
        for (int i=0; i<10; i++){
        	if (tenInts[i] > max){
        	max= tenInts[i];
    	  //  index1=i;
            }
        }
            System.out.println("The highest entry is: " +max);
    
        //sum
        int result=0;
        for(int i=0; i<10; i++){
            result += tenInts[i];
        }
            System.out.println("The sum is: "+ result);
        
        System.out.println(tenInts[0]+" "+tenInts[9]); //prints first array value and then last array value
        System.out.println(tenInts[1]+" "+tenInts[8]);
        System.out.println(tenInts[2]+" "+tenInts[7]);
        System.out.println(tenInts[3]+" "+tenInts[6]);
        System.out.println(tenInts[4]+" "+tenInts[5]);
        System.out.println(tenInts[5]+" "+tenInts[4]);
        System.out.println(tenInts[6]+" "+tenInts[3]);
        System.out.println(tenInts[7]+" "+tenInts[2]);
        System.out.println(tenInts[8]+" "+tenInts[1]);
        System.out.println(tenInts[9]+" "+tenInts[0]);
    }
}