/*
  Author: Sina Tuy
  
  Create a list of objects using a superclass
  
*/

import java.util.*;
public class TestOOP{
  
  public static void main(String[] args){
    
    //instantiate array of all objects that need to be updated
   /* ArrayList<CustomObject> list = new ArrayList<>();
    
    //instantiate objects used in this text adventure
    Armor a1 = new Armor();
    Armor a2 = new Armor();
    Cloak c1 = new Cloak();
    
    //set properties
    a1.setName("helmet");
    
    //add objects to this list
    list.add(a1);
    list.add(a2);
    list.add(c1);
    
    for(CustomObject o : list){
      System.out.println(o);
    }
    */
    Armor a1 = new Armor(); 
    System.out.println("Armor: " + a1);
    
  }
}