public class CircleDemoConstructor
{
  public static void main (String [] args)
  {
   // CircleConstructor 
     CircleConstructor cir1 = new CircleConstructor(100);
    double result1 = cir1.area();
    
    CircleConstructor cir2 = new CircleConstructor(150);
    double result2 = cir2.area();
    
    System.out.println("The area of the Soccer Field is " + result1);
    System.out.println("The area of the Cricket Field is " + result2);
  }
}