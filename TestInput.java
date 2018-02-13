/*
  Sina Tuy
  Co Sci 290
  
  Testing datatypes and input from the user
  
*/

import java.util.Scanner; //is a Java object that allows you take user input

public class TestInput{
  
  //main method - starting point of application
  public static void main(String[] args){
    //datatype variableName = expression
    //1. Identifiers can only start with a letter, _, or $
    //2. Identifiers with multiple words are camelCased
    //e.g. - numOfStudents, name, interestRate, 
    
    //primitive datatypes
    //int - integer - whole number => 3, 2147483647, 102, -11
    //double - decimal number => 3.33, 0.2, 0.33333, -33.3
    //char - single character inside single quotations => '3', '!', ' '
    //boolean - true or false => true, false
    
    //object/reference datatypes 
    //String - characters surrounded with double quotations => "skldfjsldk", "cat" "3"
    /*There are other objects in Java that comes with Java and that are custom
      => Objects/class that comes with Java: Scanner, System, Math, etc.
      => Customer classes: Zombie, SpaceInvader, Person, etc. 
    */   
    
    final double PI_VALUE = 3.1415; //constants are all capital, 
                                    //multiples words separated by underscores
    int numberOfStudents = 29;
    double avgGPA = 3.78;
    String name = "";
    boolean gameOver = false; //or true
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, give me your name: ");
    
    name = input.next(); //.next() is for String types
    
    System.out.println("Hi " + name);
    
    System.out.println("How old are you?");
    
    age = input.nextInt(); //.nextInt() is for int types
    
    System.out.println("You are " + age + " years old!");
    
    /*
      Arithmetic Operators
      +  addition
      -  substraction
      *  multiplication
      /  division
      =  assignment operator, equals
      %  modulus, remainder, e.g. 10 % 2 ==> 10 / 2 and then finding remander, which is 0
      
      Programming math operations follow the same order of operations as in Math
      (), exponents, multiplication OR division, addition OR subtraction
      from left to right
      
    */ 
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println("You are " + month + " months old OR " + days + " days old OR "
                      + hours + " hours old!");
    
    //double for user input is input.nextDouble();

    
    
    
  }

}