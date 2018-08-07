public class CircleConstructor{
    private double radius;
   //This is the constructor
    public CircleConstructor(double rad)
    {
       radius = rad;
      
    }
    //End of constructor
  public double area()
  {
    return radius * radius * Math.PI;
  }
}