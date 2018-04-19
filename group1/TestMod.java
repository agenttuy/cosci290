/*
  Author: Sina Tuy
  
  Testing mod to find remainders
  and using / to get that remainder 
  as a variable
*/

public class TestMod{
  
  //entry point
  public static void main(String[] args){
    
    //hardcode a 3-digit number
    int num = 134;
    int temp1 = 0;
    int temp2 = 0;
    
    
    
    temp1 = num % 10;
    num = num / 10;

    
    System.out.println("Temp1 " + temp1);
    System.out.println("Num " + num);
    
    temp2 = num % 10;
    
    System.out.println("Temp2 " + temp2);
    
    
    
  }
}