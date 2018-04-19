/*
  Author: Sina Tuy
  
  Testing void methods with print statements
  and functions that return Strings
*/

public class TestVoidMethod{
  
  public static void main(String[] args){
    
    //this function has a print statement in it
    testPrint();
    
    System.out.println("testing the method that " 
                       + "returns a string");
    
    /*
    this function just returns a String and 
    requires a system out to be seen on the console
    */
    System.out.println(testString());
  }
  
  /*
    This function doesn't return anything
    and uses a print statement for output
  */
  public static void testPrint(){
    System.out.println("Hello");
  }
  
  /*
    This function returns a String and 
    needs a print statement (optional) in
    order to be seen on a console
  */
  public static String testString(){
    return "Hello";
  }
}