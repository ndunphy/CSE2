//Nicolette Dunphy
//Lab 13
//Sorting

import java.util.Random;
public class Sorting{
    
    public static void main (String args[]){

        int array[][]= new int [5][];
        int temporaryValue=0;
        for (int i=0; i<5; i++){
            array[i]= new int[i*3+5];
        }
        
        for(int x=0; x<5; x++){
            for(int a=0; a<x*3+5; a++){
                array[x][a]= 0 + (int) (Math.random()*39);
            }
        }
            
                System.out.println();
            System.out.println("The array before sorting:");    
            for (int x=0; x<5; x++){
                for (int a=0; a<x*3+5; a++){
                    System.out.print(array[x][a] + " ");
                }
            
                System.out.println();
            }
    
        
        System.out.println();
        System.out.println();
        System.out.println("The array after sorting:");
        
            for (int x=0; x<5; x++){
                for (int a=0; a<array[x].length-1; a++){
                    for (int j= a+1; j<array[x].length; j++)
                        if (array[x][a] < array [x][j]){
                            temporaryValue= array[x][a];
                            array[x][a]= array[x][j];
                            array[x][j] = temporaryValue;
                        }
                    }
                }
            
                    for(int h=0; h<5; h++){
                        for (int a=0; a<h*3+5; a++){
                            System.out.print(array[h][a] + " ");
                        }
                    
                        System.out.println();
                    }
                
            }
        
        
        
    }
        
        

    
    
    
