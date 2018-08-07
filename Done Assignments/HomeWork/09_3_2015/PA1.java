import java.util.Scanner;
import java.io.*;

/*the Start of the Main method */

public class PA1{
  public static void main(String[] args)throws IOException{
   File file = new File("c:\\")/**input.txt goes here**/;
   
   Scanner inputFile = new Scanner(file);
   PrintWriter outputfile = new PrintWriter("output.txt");
   while(inputFile .hasNext(){
   String int = inputFile.nextLine();
   outputFile.println(line charAt(0));
   }
         outputFile.close();
         inputFile.close();
    
  }
}