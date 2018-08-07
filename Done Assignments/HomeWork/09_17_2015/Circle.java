public class Circle
{
  /*This main method is private*/

     private double radius;
     
     public void setRadius(double rad)
     {
       radius = rad;
     }

  public double area() {
        return radius * radius * Math.PI;
    }
}