import java.util.*;
import java.io.*;

public class TextProcessing{


// int  count = 0;
 
 
    public  static int getWordsNumber(String texts){ //Also note here
       int count = 0;
   for(int i= 0 ;i< texts.length();i++){
       
      char c = texts.charAt(i);
    if(c == ' ')
        count++;    //Increment the number of space
    }
    count = count+1; //Because number of words are number of spaces +1
    return count;

 }
 public static int getVowelsNumber(String texts) //It should be like this
        {

                int vowels = 0;
                for (int i = 0; texts.regionMatches(3,texts,3 ,4); i++)
                {
                        char ch = texts.charAt(i);
                        if (ch == 'a' || ch == 'e' || ch == 'i' || 
                                        ch == 'o' || ch == 'u')
                          vowels++; //Incrementing number of vowels
                }
                         
                return vowels;
    }   
 
 public static void displayBackwardString(String texts){ //As we are not returning anything, so our return type would be void
   int length = texts.length();//This is the length of the String
   System.out.println();
   for(int i = length-1;i>=0;i--)
   {
   System.out.print(texts.charAt(i)); //As i is in reverse order, string printed will be reverse
   
   }
 }
}
/*Create a class named TextProcessing which has the following methods—
(1) getWordsNumber(): this method accepts a string (few sentences long) as an argument and returns the number of words it contains. 
(2) getVowelsNumber(): this method accepts a string (few sentences long) as an argument and returns the number of vowels it contains.  
(3) displayBackwardString(): this method accepts a string (few sentences long) as an argument and displays its contents backward.

Then write a demo class to work with TextProcessing class.
*/
