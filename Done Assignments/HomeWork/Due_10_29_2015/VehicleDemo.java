import java.util.*;
public class VehicleDemo{
  public static void main(String[] args){
    Car a = new Car(4,5,4,5);
    System.out.println("Nummber of Seats: " + a.getSeat());
    System.out.println(a.getDoor());
    //  System.out.println(a.getDr());
     Motorcycle w = new Motorcycle(0,1,2);
     System.out.println(w.getHelmet());
     
 }

}