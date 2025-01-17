/*   CSC153 Computer Programming II Section 01 
 *   Fall 2016 Programming Assignment 8  
 * 
 * Create a class named Rectangle which has �   
 * 3 fields: (1) name  (2) length  (3) width 
 * 2 constructors: 
 * (1) A constructor that initializes name, length, and width 
 * (2) A copy constructor 
 * 7 methods:  
 * (1) setName(),(2) setLength, 
 * (3) setWidth, (4) getName() 
 * (5) getLength() (6) getWidth() 
 * (7) area(), (8) toString() 
 * (9) equals() (10) copy()  
 * Then write a demo class to work with Rectangle class. 
 */

public class Rectangle{
  private String name;
  private double length;
  private double width;
  
 /* 1st constructor  name, length, and width*/
  public Rectangle( String n ,double l, double w){
    this.name = n;
    this.length = l;
    this.width = w;
   }
   public double area(){
    return width * length;
  }
  
 /*2nd constructor A copy constructor*/
 /* public Rectangle(Rectangle r) {
        name = r.getName();
        length = r.getLength();
        width = r.getWidth;
    }*/
  public  Rectangle(Rectangle rRectangle){
    this(rRectangle.getName(), rRectangle.getLength(), rRectangle.getWidth()); 
  }
  
  //The start of Copy method
  
  public Rectangle Copy(){
    Rectangle r = new Rectangle(name,length,width);
    return r;
  }
   //The end of Copy method
  
 /*This is where the set() starts*/
  public void setName(String n){
    this.name = n;
  }
  public void setLength(double l){
    this.length = l; 
  }
   public void setWidth(double w){
    this.width = w; 
  }
 /*This is where the set() ends*/
   
 /*This is where the get() starts*/
  public String getName(){
    return name;  
  }
  public double getLength(){
    return length;  
  }
  
  public double getWidth(){
    return width;  
  }
 /*This is where the get() ends*/
  //The start of toString method
  public String toString() {
        return "Name: " + name + "\tLength: " + length + "\t" + width;
    }
  
  //The end of the toString method
  
  //the start of the equal method
  /*public boolean equals(Rectangle obj ){
    if (obj == area(length* width)) { 
      return true; 
    }
    if (obj == null || obj.getLength() != this.getWidth()) { 
      return false; 
    } 
    return area ;
    /*
     *
    Rectangle rc = (Rectangle) obj; 
    return name == rc.name && (length== rc.length || (length!= 0 && equals(rc.getLength()))) && (width == rc.width || (width != 0 && equals(rc.getWidth())));*/
  public boolean equals(Rectangle r ){
    if (length == r.length && width == r.width && name.equals(r.name))
      return true;
    else 
      return false;
  }
  
   //The end of the equal method
  
}