//Nicolette Dunphy
//CSE2
//Lab 2
//Cyclometer
//9/5/14


//My bicycle cyclometer records two kinds of data, time in seconds, and number of rotations


//define a class
public class Cyclometer{

//main method
    public static void main(String[] args) {
        
        int secsTrip1=480;  //Time elapsed of Trip 1 in seconds
        int secsTrip2=3220; //Time elapsed of Trip 2 in seconds
        int countsTrip1=1561;   //Number of rotations in Trip 1
        int countsTrip2=9037;   //Number of rotations in Trip 2
        
        double wheelDiameter=27.0, //constant for wheel diameter
        PI=3.14159, //constant for value of pi
        feetPerMile=5280,   //constant for number of feet in 1 mile
        inchesPerFoot=12,   //constant for number of inches in 1 foot
        secondsPerMinute=60;    //constant for number of seconds per 1 minute
        double distanceTrip1, distanceTrip2, totalDistance; //
        
        //print out calculations
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
        //run the calculations
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distance of trip in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance of Trip 2 in miles
        totalDistance=distanceTrip1+distanceTrip2; //total distance
        
        //Print out the outputs
        
        System.out.println ("Trip 1 was "+distanceTrip1+" miles");
        System.out.println ("Trip 2 was "+distanceTrip2+" miles");
        System.out.println ("The total distance was "+totalDistance+" miles");

    }
}