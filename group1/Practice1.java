/*
  Sina Tuy
  Co Sci 290
  
  Lab - comment every single line of code
  
  Inputs:
  
  Output:

  
*/
import java.util.Scanner;
public class Practice1{
  
  //entry point of app
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int operand1;
    int operand2;
    
    System.out.println("Please enter in a whole number...");
    
    operand1 = input.nextInt();
    
    System.out.println("Please enter in another whole number...");
    
    operand2 = input.nextInt();
    
    System.out.println("Let's do some basic math! \n "
                       + "Here are the numbers you chose.");
    System.out.println("Operand1: " + operand1 + " and Operand2: " + operand2);
    System.out.println(operand1 + operand2);
    System.out.println(operand1 * operand2);
    System.out.println(operand1 / operand2);
    System.out.println(operand1 - operand2); 
   
  }
  
}