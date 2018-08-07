/* Write classes SphereClass which implement the interface you created.*/
//Date: 11-11-2015
//Create by:Linner Rivas

public class SphereClass implements ObjectWithOneParameter{
  public double surfaceArea(double p){
    return 4 * Math.PI * p * p;
  }
  public double volume(double p){
    return (4 * Math.PI * p * p * p) / 3;

  }
}