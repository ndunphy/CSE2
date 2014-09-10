//Nicolette Dunphy
//CSE2
//HW2
//Arithmetic

//Define the class

public class Arithmetic{
    
//main method

    public static void main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //tax percentage
        double taxPercent=0.06;
        
        //Calculate total cost of socks
        double totalSockCost$=nSocks*sockCost$;
        //Calculate sales tax on socks
        double totalSockTax$=totalSockCost$*taxPercent;
        
        //Calculate total cost of glasses
        double totalGlassCost$= nGlasses*glassCost$;
        //Calculate sales tax on glasses
        double totalGlassTax$=totalGlassCost$*taxPercent;
        
        //Calculate total cost of envelopes
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        //Calculate sales tax on envelopes
        double totalEnvelopeTax$=totalEnvelopeCost$*taxPercent;
        
        //Calculate total of items without tax
       double subtotal$=totalGlassCost$+totalSockCost$+totalEnvelopeCost$;
        //Calculate total tax of items
        double totalTax$=subtotal$*taxPercent;
       
       //Converting double to int for total tax
        int totalTax1$= (int)(totalTax$*100);
        double totalTax2$= totalTax1$/100.0;
        
        //Calculate total cost
        double totalCost$=subtotal$+totalTax2$;
        
        //Converting doubles to integers for answers with two decimal points
        int totalSockTax1$= (int)(totalSockTax$*100);
        double totalSockTax2$= totalSockTax1$/100.0;
        
        
        int totalGlassTax1$= (int)(totalGlassTax$*100);
        double totalGlassTax2$= totalGlassTax1$/100.0;
        
        int totalEnvelopeTax1$= (int)(totalEnvelopeTax$*100);
        double totalEnvelopeTax2$= totalEnvelopeTax1$/100.0;
        
        
       
        
        System.out.println("Socks");
        System.out.println(nSocks);
        System.out.println(sockCost$+" "+"per sock");
        System.out.println("Subtotal"+"="+"$"+totalSockCost$);
        System.out.println("Total tax"+"="+"$"+totalSockTax2$);
        System.out.println("");
    
        System.out.println("Glasses");
        System.out.println(nGlasses);
        System.out.println(glassCost$+" "+"per glass");
        System.out.println("Subtotal"+"="+"$"+totalGlassCost$);
        System.out.println("Total tax"+"="+"$"+totalGlassTax2$);
        
        System.out.println("");
        System.out.println("Envelopes");
        System.out.println(nEnvelopes);
        System.out.println(envelopeCost$+" "+"per envelope");
        System.out.println("Subtotal"+"="+"$"+totalEnvelopeCost$);
        System.out.println("Total tax"+"="+"$"+totalEnvelopeTax2$);
        
        System.out.println("");
        System.out.println("Total of all products"+"=$"+subtotal$);
        System.out.println("Total tax of all products"+"=$"+totalTax2$);
        System.out.println("Grand total"+"=$"+totalCost$);
       
    }
}