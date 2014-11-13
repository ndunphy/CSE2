//Nicolette Dunphy
//Lab 12
//Array Math
//Purpose of program: call methods to perform arithmetic operations on arrays
/*output:

OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/

public class ArrayMath{ //class
  public static void main(String [] arg){ //main method
    double x[]={2.3, 3, 4, -2.1, 82, 23}, //double array wtih 6 given values
      y[]={2.3, 3, 4, -2.1, 82, 23}, //y array (double) with specific values
      z[]={2.3, 13, 14}, //z array (double) with 3 specific values
      w[]={2.3, 13, 14, 12},  //w array (double) with 4 specific values
      v[], // v array (double) is the result of the added arrays
      u[]={2.3, 12, 14}; //u array (double) is give with 3 specific values
   
     v=addArrays(x,y); //calls addArrays methods with two inputed arrays as x and y
   
  
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                       +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                         " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){ //displays the arrays
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }

  public static double [] addArrays(double [] x, double [] y){ //method addArrays with output as array and inputs as 2 arrays
    
     double v[]= new double [x.length]; //declares and initializes array v
     int i=0; //initializes and declares i
      if (y.length==x.length){ //if the two arrays are of the same length
          for (i=0; i<x.length; i++){ //runs for as many values of the x array there are
          v[i]=x[i]+y[i]; //sets v[i] equal to the corresponding x and y array values at the same i
          } 
          return v; //array v is returned
      }
       
         if (y.length<x.length){ //if the lengths aren't the same and y is less than x
             for (i=0; i<y.length; i++){ //run for as many values there are in y
                  v[i]=x[i]+y[i]; //same as normal, just add corresponding parts of x and y and set to v
             }
            
             for(i=x.length-y.length; i<x.length; i++){ // for the remaining values that x has where y doesnt have any values
                 v[i]=x[i]; //the value of v is simply the x value bc y is then just 0
             }
         
      }
     return v; //return the array v
  }
    
    public static boolean equals(double [] x, double [] y){ //sets value in statement as either true or false when comparing two arrays
       boolean answer=true; //declares and initializes answer
    
        if (x.length==y.length){ //if the lengths are the same
            for(int i=0; i<x.length; i++){ //runs for as many values as there are in x array

              if(x[i]==y[i]){ //if the value of the corresponding parts of x and y are the same for every part of the array true is returned
                 answer=true; //sets value of answer to true
              }
              else{ //if any number is not the same and it comes to this part then false is returned and it exits the for loop
                  answer=false; //sets value of answer to false
                  break; //exits for loop
              }
            }
        }
        else{ //if two lengths aren't the same defaults to false
           
            answer=false; //sets answer to false
        }
      
        return answer; //returns the value of answer
        
    }
    
    
    
    
}

