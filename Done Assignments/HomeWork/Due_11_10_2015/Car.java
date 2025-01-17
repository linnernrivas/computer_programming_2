/*Write a subclass Car which has the following-- 
 * Attributes: (1) door (number of door)
 * (2) window (number of window). 
 * Constructor: which sets the value of door, window, wheel and seat.
 * Methods: (1) getWindow()�returns the number of window
 * (2) getDoor()�returns the number of door
 *  (3) Implementation of the printDetails() method.
 */
//Created :11-9-2015
//Author: Linner Rivas
import java.util.*;

public class Car extends Vehicle{
  int door;
  int window;
  public Car(int s, int w, int d ,int wi){
    super(s,w);
    door = d;
    window = wi;
  }
  public int getWindow(int window){
   
    return window;
  }
  public int getDoor(int door){
   return door;
  }
  
  public void printDetails(){
    System.out.println( "The number of Wheels: " + getWheel()+ " ," + "Number of Seats: " + getSeat() + "," +"The number of Windows: "+window +","+ "The number of doors:" + door); //, getWheel();
  }
}