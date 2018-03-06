/*
  Your name
  Co Sci 290
  
  Use control structures to do string manipulation 
    and user validation
    
  Built-in String functions
    str.length()
    str.toLowerCase() - makes all letters lowercase
    str.toUpperCase() - makes all letters uppercase
    str.equals("some other string") - checks if two Strings are 
        exactly the same
    str.equalsIgnoreCase("no") - checks if two Strings are 
      equal regardless of case
    str.charAt(int index) - get a specific character at index
    str.substring(int startIndex, int endingIndex) - gives a subset string based
      based on given range
      
    Lab - 
    Write a program that takes user input in the format of "[number between 0-9] [item]"
    
    input: 2 guns
    
    output: 
    You have 2 items.
    Those items are guns

*/
public class Logic1{
  
  //main method
  public static void main(String[] args){
    
    //declare variables
    String str = "Java Rules!"; //length = 11
    int num = 10;
    
    //use loop to iterate through str
    for(int index = 0; index < str.length(); index++){
      
      //only print out characters of str that are at even indices
      if(index % 2 == 0){
        System.out.println(str.charAt(index));
      }

    }//end for-loop
    
    System.out.println(str.substring(0, 4)); //output - "Java"
    
  }
  
}