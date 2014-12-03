//Nicolette Dunphy
//Lab6
//Engima2

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * The runtime error says that there is an Artihmetic Expection (dividing by zero)
 * delete /0 from line 13 and it runs properly
 * 
 * 
 */

