//Nicolette Dunphy
//HW 11
//Matrix Sorter
//Purpose: Work with multidimensional arrays

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "); //took out a + after the quote and add );
  		//	findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
   // sort(mat3d[2]);
    show(mat3d);
   }
   public static int [][][] buildMat3d(){ //this method builds the array by assigning random values to the array
       
       int [][][] mat3d= new int [3][5][7]; //given bounds
        
     int j=0;  //declares and initializes
     while (j<mat3d.length){ //while statement to run the initialization of the array as long  as it is in bounds
         int i= (int)(Math.random()*(99-1)); //i is random value that is remade after each iteration
         mat3d[j][j][j]=i; //array is set to i
         j++; //increment j
         
     }
       
       return mat3d; //array is returned
       
   }
   
   
   public static String show(int mat3d [][][]) { //method to display the array
       
      String out="{";
    for(int j=0;j<mat3d.length;j++){ //adds to string out
      if(j>0){
        out+=", ";
      }
      out+=mat3d[j][j][j]; //adds each time a new value as j is incremented
    }
    return out+"}";
  }
       
       
       
   
   
  // public static int findMin(int mat3d [][][]) {
       
       
       
//   }
   
  // public static int [][][] sort(int mat3d [][]) {
       
       
       
       
  // }
   
   //public static int [] sort(int mat3d []) { //overloaded version of sort with input of 1D
       
       
       
       
//   }
    
    
    
    
    
    
}
