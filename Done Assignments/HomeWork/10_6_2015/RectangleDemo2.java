public class RectangleDemo2{
   public static void main(String[] args){
       Rectangle mainStreet = new Rectangle("Main", 155,190);
       Rectangle topLength = new Rectangle("origin_one", 100, 200);
       topLength.setLength(25.0);
       Rectangle m101 = topLength;    
       topLength.setLength(200);
      m101.setWidth(190);
        
    System.out.println("Top length: " + topLength.getLength());
    System.out.println("M101Copy mass: " + m101.getWidth());
    System.out.println("MainStreet Name: " + mainStreet.getName());
      
    
     //Rectangle streetName = new Rectangle();
     //streetName.setName(250);
    //Rectangle topLength = new Rectangle(155);
   // System.out.println("M101CopyTwo mass: " + m101CopyTwo.getMass());
    
  }
}
