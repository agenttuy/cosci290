/*
  Sina Tuy
  Co Sci 290
  
  Demo on the String class  
*/

import java.util.Scanner;
public class TestStrings{

  //main method
  public static void main(String[] args){
    


    /*
      When you want code to run at least once, use a do-while loop
      
      do{
      
        the body with code.
        ...
        
      }while(some condition)
    */
    
    
    /*
      Example below is to test for specific response
      
      answer.toLowerCase() - makes all letters lowercase
      answer.toUpperCase() - makes all letters uppercase
      answer.equals("some other string") - checks if two Strings are 
        exactly the same
      answer.equalsIgnoreCase("no") - checks if two Strings are 
        equal regardless of case
    
    */
    
    
    System.out.print("Example of getting a specific "
                     + "response from user below..");
    
    //ask the user a question
    System.out.println("Are you rich? Yes or No?");
    
    //check if answer is specifically Yes or No
    if(answer.equalsIgnoreCase("no")){ //"no" != "No" != NO != nO
      System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool.");
    }
    
  }
  
}