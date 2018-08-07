import java.io.*;
import java.util.Scanner;

public class PA2 {
 
 public static void main(String[] args){
     int max;
     int min;
     int value;
     
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter option: ");
        value = keyboard.nextInt();
         
         if(value != 1 &&  value != 2){
             System.out.print("Operation failed. You need to enter 1 or 2 ");
         }
         
         else{
             System.out.print("Enter minimun value: ");
             min = keyboard.nextInt();
             
             System.out.print("Enter maximun value: ");
             max =  keyboard.nextInt();
            
                if(value == 1){
                   System.out.println("The sum is " + add(min,max));
                }
                
                else if(value == 2){
                     System.out.println("The product is " + mul(min,max));
                    
                }
             }
 }
 
 public static int add(int min,int max){
  //  return min + max;
  int result = 0;
  for (int i = min; i <= max; i++)
  {
      result += i;
  }
  return result;
 }

 public static int mul(int min,int max){
    int result = 1;
    for(int i = min; i <=max;i++)
    {
        result*= i;
    }
    return result;
 }
}
 
 