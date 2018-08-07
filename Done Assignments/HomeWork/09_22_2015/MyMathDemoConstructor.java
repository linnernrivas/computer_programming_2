public class MyMathDemoConstructor{
  public static void main (String [] args)
  {
   MyMathConstructor Math1 = new MyMathConstructor(6,8);
    double result1 = Math1.area();
    MyMathConstructor Math2 = new MyMathConstructor(10,16);
    double result2 = Math2.area();
    System.out.println("The area of the first circle is " + result1);
    System.out.println("The area of the second circle is " + result2);
  }
  
}