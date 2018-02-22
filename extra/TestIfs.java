/**
  Practicing different If, if-else, 
    if - else if - else sitautions
*/
public class TestIfs{

  public static void main(String[] args){
    
    int minimum = 1;
    int maximum = 100;
    //int randomNum = minimum + (int)(Math.random() * maximum);
    int randomNum = 80;
    
    if(randomNum > 5){
      System.out.println(randomNum + " is greater than 5.");     
    }
    
    if(randomNum > 50){
      System.out.println(randomNum + " is greater than 5.");
    }
    
    if(randomNum > 75){
      System.out.println(randomNum + " is greater than 5.");
    }
    
    //The above is not equivalent to below
    if(randomNum > 5){
      System.out.println(randomNum + " is greater than 5.");     
    }
    else if(randomNum > 50){
      System.out.println(randomNum + " is greater than 5.");
    }
    else if(randomNum > 75){
      System.out.println(randomNum + " is greater than 5.");
    }

  }
}