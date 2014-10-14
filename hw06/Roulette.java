//Nicolette Dunphy
//HW6
//Roulette
//Purpose of program: For this program, use a random number generator (recall Math.random()) to simulate this person’s betting on 100 spins, but run the simulation 1000 times and collect data on the outcome



public class Roulette{
    
    public static void main(String[] arg){
        
        int random1;
        int repetitions=1;
        int profit$=0;
        int zeroProfit=0;
        int profitCounter=0;
        
      while (repetitions<=1000){  
        int dollars = 100; 
        int spinNumber=1; //first 100 spins
        random1=(int)(Math.random()*((38-0)+1));
        while (spinNumber<=100){

        int random2=(int)(Math.random()*((38-0)+1));
        
        if (random2==random1){//if random number is equal to correct number
            dollars +=36; //add $36 to money you've earned
            profit$ +=36; //adds $36 to total profit
    }
        else{
            profit$ -=1; //lose $1 if they aren't equal
            dollars -=1; //lose $1 if they aren't equal
        }
        spinNumber++;//adds 1 to spin number each time until it gets to 100
    
        if(dollars==0){
            zeroProfit+=1; //adds one to counter of times profit is $0
        }

}
        if(dollars>0) {
            profitCounter++;
        }
repetitions++;
      }
    System.out.println("Number of times I walked away with profit: " +profitCounter);
    System.out.println("Number of times I lost everything: "+ zeroProfit);
    System.out.println("Total winnings:$ "+profit$);
    
    
    
    
    }
}