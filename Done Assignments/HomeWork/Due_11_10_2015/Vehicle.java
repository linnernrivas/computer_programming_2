/*Write a super class Vehicle which has the following--- 
 * Attributes: (1) wheel (number of wheel) and (2) seat (number of seat). 
 * Constructor: which sets the value of wheel and seat. Methods: 
 * (1) getWheel()Ñreturns the number of wheel            
 * (2) getSeat()Ñreturns the number of seat          
 * (3) printDetails()ÑThis is an abstract method which prints the details of the vehicle. 
 * For example, if it is a car type vehicle, it will print number of seat, number of wheel, number of door, 
 * and number of window.In contrast, if it is a motorcycle, 
 * this method will print number of seat, number of wheel, and number of helmet.*/
//Created 11-9-2015
// author: Linner Rivas
import java.util.*;

public abstract class Vehicle{
  private int wheel;
  private int seat;
  public Vehicle(int w ,int s){
    wheel = w;
    seat = s;
  }
  public int getWheel(){
    return wheel;
  }
  public int getSeat(){
    return seat;
  }
  public abstract void printDetails();
}