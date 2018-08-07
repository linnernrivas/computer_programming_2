public class MyMathDemo{
  public static void main (String [] args)
  {
   MyMathConstructor ma1 = new MyMathConstructor(6,8);
    double result1 = ma1.area();
    MyMathConstructor ma2 = new MyMathConstructor(10,16);
    double result2 = ma2.area();
    System.out.println("The area of the first circle is " + result1);
    System.out.println("The area of the second circle is " + result2);
  }
  
}