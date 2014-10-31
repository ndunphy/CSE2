//Nicolette Dunphy
//Lab10
//MethodCalls
//Purpose of program: Write methods that call other methods inside of them

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int a, int z){ //addDigit method
       
       int answer=0; //declares and initializes answer
       String n1, n2, n3; //declares n1 n2 and n3 as strings
       if (z>0 && a>0){ //if inputs are positive
        n1= ""+a; //makes a into a string
        n2= ""+z; //makes z into a string
        n3= n2+n1; //combines both into a string
         answer = Integer.parseInt(n3); //converts String to integer
       }
       else if (a<0){ //if a is negative
        n1= ""+(a*-1); //makes the 1st string positive
        n2= ""+z; //makes z into string
        n3= n2+n1; //combines strings
         answer = Integer.parseInt(n3); //converts String to integer
         answer *= -1; //now adds negative to beginning by multiplying by 1
       }
       else if (z<0){ // if z is negative (same procedure as with a)
           n1= ""+a; //makes a into a string
           n2= ""+(z*-1); //makes z positive and into a string
           n3= n2+n1; //combines numbers
           answer= Integer.parseInt(n3); //converts String to integer
           answer *= -1; //makes answer negative by mulitplying by -1
       }
        
        
        
        return answer; //returns the answer as the value of addDigit 
        
    }
    public static int join(int a, int b){ //join method
        int z=addDigit(b,a); //calls addDigit method as the int z
        
        return z; //returns z (result of addDigit) as the result of join
    }
    
    
    
    
    
    
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
