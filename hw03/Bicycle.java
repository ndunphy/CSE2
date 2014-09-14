//Nicolette Dunphy
//HW3
//CSE2
//Bicycle
//due Tuesday 9/16/2014

//Program uses inputed number of counts on cyclometer and number of seconds to determine distance travelled and average miles per hour.

//need to import Scanner class
import java.util.Scanner;


//define a class
public class Bicycle{
    
    //add a main method
    public static void main(String[] args) {
        
       Scanner myScanner;
        myScanner= new Scanner ( System.in );
        System.out.print(
            "Enter the number of seconds during which the counts occurred : ") ;
       
       int secsTrip = myScanner.nextInt () ;
       
       //next statement for user input
       System.out.print("Enter the number of counts : ") ;
        
        int countsTrip = myScanner.nextInt ();
        
        //constants
        double wheelDiameter= 27.0, //Wheel diameter in inches
        PI= 3.14159, //Constant for value of pi
        feetPerMile= 5280, //Constant for number of feet per one mile
        inchesPerFoot= 12, //Constant for number of inches per one foot
        secondsPerMinute= 60; //Constant for number of seconds per minute
        
        double distanceTrip= (countsTrip*wheelDiameter*PI)/ (feetPerMile*inchesPerFoot); //distance travelled in miles
        
        //Convert numbers to only two decimal points
        double distanceTrip1= distanceTrip*100.0;
        double distanceTrip2= (int)distanceTrip1/100.0;
        
        
        double timeTrip= secsTrip/secondsPerMinute; //calculates total time of trip in minutes
        
        //Convert numbers to only two decimal places
        double timeTrip1= timeTrip*100.0;
        double timeTrip2= (int)timeTrip1/100.0;
    
        
        double hoursTrip= timeTrip/60;
        double speedTrip= distanceTrip/hoursTrip; //calculates miles per hour using miles divided by time in minutes divided by 60 to get hours
        
        //Convert numbers to only two decimal points
        double speedTrip1= speedTrip*100.0;
        double speedTrip2= (int)speedTrip1/100.0;
        
        //Output
        
        System.out.println("The distance was "+distanceTrip2+" miles and took "+timeTrip2+" minutes. The average mph was "+speedTrip2+".");
    }
}