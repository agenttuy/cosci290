/*
  Author: Sina T.
  Purpose: Test getting subclasses by using the .getClass() 
  when in a superclass contect
*/

import java.util.*;

public class TestGetClass{
  
  //main method
  public static void main(String[] args){
    
    //declare list of supertype
    ArrayList<Armor> list = new ArrayList<Armor>();
    
    //add different subclasses
    list.add(new Cloak());
    list.add(new Helmet());
    list.add(new Cloak());
    
    //iterate through each object to do stuff with
    for(Armor a : list){
      //check if object is f a certain type to do certain things
      if(a.getClass().equals(Cloak.class)){
        System.out.println("This is a cloak!");
      }
      else{
        System.out.println("This is another subclass of Armor!");
        //below do specific methods of subclass below by casting
        Helmet h = (Helmet)a;
        h.setDurability(5); //this is a method of Helmet
        System.out.println(h);
      }
    }
    
  }//end main
}//end class