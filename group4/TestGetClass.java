/*
  Author: Sina T.
  Purpose: Test getting subclasses by using the .getClass() 
  when in a superclass contect
*/

import java.util.*;

public class TestGetClass{
  
  //main method
  public static void main(String[] args){
    
    ArrayList<Armor> list = new ArrayList<Armor>();
    
    list.add(new Cloak());
    list.add(new Helmet());
    list.add(new Cloak());
    
    for(Armor a : list){
      if(a.getClass().equals(Cloak.class))
        System.out.println("This is a cloak!");
      else
        System.out.println("This is another subclass of Armor!");
    }
    
  }//end main
}//end class