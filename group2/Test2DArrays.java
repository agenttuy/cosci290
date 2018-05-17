/*
  Author: Sina
  Purpose: Test 2D arrays
*/
public class Test2DArrays{
  
  //main method
  public static void main(String[] args){
    
    //declare 2D arrays
    String[][] words = new String[3][2];
    /*
      {
        {null , null},
        {null , null},
        {null , null}
      }
      
    */
    
    //assign first element in 2d array
    words[0][0] = "cat";
    
    //get element in 2d array
   // System.out.println(words[0][0]);
   // System.out.println(words[0][1]);
    
    //iterate through array and assign values using loops
    for(int i = 0; i < words.length; i++){ //goes though each row
      for(int j = 0; j < words[i].length; j++){ //goes through each column 
        words[i][j] = i * j + " cats"; //assign
        System.out.println(words[i][j]); //print
      }
    }
    
    //use custom function
    System.out.println(print2DArray(words));
    
  }//end main
  
  //this method concatenates all elements in a 2d arrays
  public static String print2DArray(String[][] array){
    
    //holder for concatenated string
    String concat = "";
    
    //go through each element in 2d array
    for(int i = 0; i < array.length; i++){ //row
      for(int j = 0; j < array[i].length; j++){
        concat = concat + array[i][j] + " "; //concatentates each String element
      }
    }
    
    return concat;
    
  }//end custom method
  
  
  
  
  
  
  
}//end class