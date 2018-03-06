/*
  Your name
  Co Sci 290
  
  Intro to arrays
  
  Lab - Assign every element a value and then iterate and print each element
*/

public class Arrays1{
  
  public static void main(String[] args){
  
     //declare an array of type int
    String[] numbers = new String[10]; 
    
    //iterate through the loop and print
    for(int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
    
    //assign element at index 3 the value "five"
    numbers[3] = "five";
    //numbers[11] = "twenty"; //can't do this line, will give arrayIndexOutOfBounds error
    
    //redeclare with a different size because you cant add or remove
    numbers = new String[8];
 
  }
  
}