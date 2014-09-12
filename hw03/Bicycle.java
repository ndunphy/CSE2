//Nicolette Dunphy
//HW3
//CSE2
//Bicycle
//due Tuesday 9/16/2014

//Program uses inputed number of counts on cyclometer and number of seconds to determine distance travelled and average miles per hour.

//define a class
public class Bicycle{
    
    //add a main method
    public static void main(String[] args) {
        
        int secsTrip= 480; //Time elapsed in seconds of trip
        int countsTrip= 1561; // Number of rotations of trip
        
        double wheelDiameter= 27.0, //Wheel diameter in inches
        PI= 3.14159, //Constant for value of pi
        feetPerMile= 5280, //Constant for number of feet per one mile
        inchesPerFoot= 12, //Constant for number of inches per one foot
        secondsPerMinute= 60; //Constant for number of seconds per minute
        
        double distanceTrip= (countsTrip*wheelDiameter*PI)/ feetPerMile*inchesPerFoot; //distance travelled in miles
    }
}