/*
  Author: Sina
  
  Purpose: Play around with arrays
*/

public class TestArrays{
  
  //entry point of program
  public static void main(String[] args){
    
    //declare an array
    String[] names = new String[5];
    
    //assign values to this array
    names[0] = "Steven";
    names[1] = "Chris";
    names[2] = "Hai";
    names[3] = "Gerson";
    names[4] = "Adam";
    
    //update 
    names[4] = "Lynn";
    
    for(int i = 0; i < names.length; i++){
      System.out.println("Element " + i + ": " + names[i]);
    }
    
  }//end main
}//end class