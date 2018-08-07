import java.util.*;
public class Car extends Vehicle{
 int door;
 int window;
 public Car(int w,int s, int d,int wi){
  super(w,s);

  door = d;
  window = wi;
 }
 public double getWindow(){
    return window;
  }
  public double getDoor(){
    return door;
  }

}