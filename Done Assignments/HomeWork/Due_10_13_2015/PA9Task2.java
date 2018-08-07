import java.util.*;
/*Write a program where you create an ArrayList object that can store numbers. 
Show how can you add a number to the ArrayList, remove a number from theArrayList, 
replace a number in the ArrayList, insert a number in a specific location in the ArrayList, 
and display all the numbers in the ArrayList.*/


public class PA9Task2{

	public static void main(String[] args){
    //create ArrayList Object

    ArrayList <Integer> numberList = new  ArrayList<Integer>();
    //Add Item
     numberList.add("2");
     numberList.add("4");
     numberList.add("6");
     numberList.add("8");
     numberList.add("10");
   
   //Size
     numberList.size();
     
    //Access
     numberList.get(0);   
     
     //insert in a specific location
     numberList.add(6,"12");
     
     //remove
    numberList.remove(1);
     
     //Replace
     numberList.set(2,"3");
      
    //Echanced For loop
    for(String number: numberList){
    System.out.println(number);
    }
     
    //Your using for loop
   //  for(int i = 0; i < numberList.size(); i++){
    // System.out.println(nameList.get(i));
   //  }
    // System.out.println("The number of list " + nameList.size());
  }

	
}