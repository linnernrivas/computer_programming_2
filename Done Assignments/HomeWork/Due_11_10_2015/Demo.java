//Write a Demo class which creates objects of Vehicle, Car, and Motorcycle classes and call the corresponding methods.
//Created 11-9-2015
//Author:Linner Rivas
import java.util.*;
//this is the demo class
public class Demo{
  public static void main(String[] args){
   // Circular3DObject obj = new Circular3DObject(); if only this you get an Error: Circular3DObject is abstract; 
   // cannot be instantiated 
    
    // should be written as 
    Vehicle c,m;
    c = new Car(4,5,5,6);// this is overriding
    m = new Motorcycle(2,2,2);// this is overriding
    c.printDetails();
   m.printDetails();

  // System.out.println("Car number of doors" + m.getHelmet());
    
  }
}