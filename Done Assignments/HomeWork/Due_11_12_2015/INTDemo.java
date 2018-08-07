public class INTDemo
{
 public static void main (String [] args)
 {
  //CubeClass c = new CubeClass();
  //SphereClass s = new SphereClass();// this object 
    ObjectWithOneParameter i, s;
   i = new CubeClass();// This is the refernce varible
   s = new SphereClass();
  System.out.println("This is the Surface Area of Cube: " + i.surfaceArea(120.0));
  System.out.println("This is the Volume of Cube: " + i.volume(80.0));
  System.out.println("This is the Surface Area of Sphere: " + s.surfaceArea(100.0));
  System.out.println("This is the Volume of Sphere: " + s.volume(50.0));
}
}