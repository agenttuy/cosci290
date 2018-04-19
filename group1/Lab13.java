/*
  Author: Sina 
  
  Lecture:
    Introduction to methods. 
  
  Lab:
    Finish the multiply and divide methods.
*/

public class Lab13{
  
  //start of program
  public static void main(String[] args){
    
    //declare variables
    int a = 1;
    int b = 3;
    int c = 0;
    int d = -5; 
    
    System.out.println("Operations on a = " + a + "  and b = " + b + ": ");
    System.out.println("addition = " + add(a, b));
    System.out.println("subtraction = " + subtract(a, b));
    
  }//end of main
  
  
  //this custom method adds two integers
  public static int add(int num1, int num2){
    
      //declare variables
      int sum = 0;

      //add num1 and num2 and assign to sum
      sum = num1 + num2;

      //return sum of num1 and num2
      return sum;
    
  }//end of add
  
  
  //this custom method subtracts two integers
  public static int subtract(int num1, int num2){
    
    //declare variables
    int difference = 0;
    
    //substract num1 by num2 and assign to difference
    difference = num1 - num2;
    
    //return the difference of num1 and num2
    return difference;
    
  }
  
  
}//end of class