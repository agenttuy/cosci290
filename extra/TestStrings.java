/*
  Testing built-in functions with Strings
  
*/
import java.util.Scanner;
public class TestStrings{

  public static void main(String[] args){
    
    //instantiate Scanner object for user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("Do you want to drive North or South?");
    
    String direction = input.next();
    
    if((direction.toLowerCase()).equals("north")){
      System.out.println("You're heading North!");
    }
    else if((direction.toLowerCase()).equals("south")){
      System.out.println("You're heading South!");
    }
    else{
      System.out.println("I don't understand!");
    }
  
  }
}