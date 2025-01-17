/*Write an interface ObjectWithOneParameter which has the following methods---
 * Methods: (1) surfaceArea (double p)�returns the surface area of a particular object                 
 * (2) volume (double p)�returns the volume of a particular object   
 * Write two classes CubeClass and SphereClass which implement the interface you created.  
 * Write a Demo class which creates objects of CubeClass and SphereClass 
 * and call the corresponding methods. */
//Date: 11-11-2015
//Created by: Linner Rivas

//This is the "Interface" Class
public interface ObjectWithOneParameter{
  
  //Final, static, public ==> can't be modified
  double p = 100;
  double surfaceArea(double p);//Interface, not class
  double volume(double p);//Everything in Interface is automatically public
  
}
