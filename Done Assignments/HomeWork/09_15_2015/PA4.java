
import java.io.*;
/* Programming Assignment 4*/
public class PA4{
  
   /*Main Method starts here*/
  
  public static void main(String[] args){
   int[][] table = {{2, 4, 6, 8, 10},
                    {12, 14, 16, 18, 20},
                    {22, 24, 26, 28, 30},
                    {32, 34, 36, 38, 40},
                    {42 ,44, 46, 48, 50}};
   //int i = 0;
   
   
  double tab = Average2DArray(table);
  System.out.println(tab);
    System.out.println("Average Row = " +  AverageRow(table));
    System.out.println("Average Column  = " + AverageCol(table));
 
    int min = min2DArray(table);
   System.out.println(min);
   /*int min=; //Garbage
    for(int i = 0;i < table.length;i++) // Garbage
    {
      for (int n = 0; n< table.length;n++)  //Garbage
       {
       System.out.print(table[i][n]);
       }
     System.out.println();
     }*/
   display2DArray(table);
  } /*Main method Ends here*/
  
  
  /*The  dispaly2DArray() starts here */
  public static void display2DArray(int[][] arrayIn)
  {
    for(int row = 0; row < arrayIn.length;row++)
      for(int col = 0; col < arrayIn[row].length;col++)
      //arrayIn[row][col]=row + col;
      System.out.print("");
      
    for(int row = 0; row < arrayIn.length;row++){
      for(int col = 0; col < arrayIn[row].length;col++)
        System.out.print(arrayIn[row][col] + "\t");
        System.out.println();
    }
     
  }
  /*The  dispaly2DArray() ends here */
  
 
  
  
  /*Average 2D array starts here !!!*/
  public static double Average2DArray(int[][] tab)
  {
    int sum=0;
    double avg=0;
    for (int col = 0; col < tab[0].length;col++)
    {
      sum = 0;
      for(int row = 0 ; row < tab.length;row++)
        sum += tab[col][row];
      avg = sum / tab.length;
    }
  
    System.out.println("The Average of the 2D Array is " + avg);
    return avg;
  }  /*Average 2D array ends here!!*/
  
  
  
  
  
  /*Average for Row and Column starts here*/
  public static int AverageRow(int table[][]) {
    int sum = 0;

    for (int i = 0; i < table.length; i++) {
        for (int j = 0; j < table[i].length; j++) {
            sum += table[i][j];
        }
    }
    return sum / table.length;
}
  public static int AverageCol(int table [][]) {
    int sum = 0;

    for (int i = 0; i < table.length; i++) {
        for (int j = 0; j < table[i].length; j++) {
            sum += table[i][j];
        }
    }
    return sum / table.length;
   } /*Average for Row and Column Ends here*/
  
  
  
  /*This is were the min2DArray starts*/
  
  public static int min2DArray(int[][] num)
  {
      int min =0;
  for(int i = 1; i< num.length; i++){
  //if(num [i] > min)
   // min=num [0][1];
   }
  return min;
  }

  
  
  /*This is were the min2DArray Ends*/
  
}
