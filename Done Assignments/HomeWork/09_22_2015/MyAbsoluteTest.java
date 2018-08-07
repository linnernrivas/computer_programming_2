public class MyAbsoluteTest{
  public static void main (String [] args)
  {
   int result1 = Absolute.absolute(10);
   int result2 = Absolute.absolute(-5);
  
  
  double result3 = Absolute.absolute(20.6);
  double result4 = Absolute.absolute(-15.25);

    System.out.println("This is the absolute of an integer: " + result1 + ", " + result2);
    System.out.println("This is the absolute of an float : " + result3 + " , " + result4);

  }
  
}