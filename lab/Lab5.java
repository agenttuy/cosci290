/*
  Name
  Co Sci 290
  
  Lab 5
  - fix the logic and make this code check if each character is a letter
*/

import java.util.Scanner;
public class Lab5{

  public static void main(String[] args){
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    int nameLength = 0;
    String answer = "";
    boolean flag = true; //true that character is a letter
    
    //check if the name is more than 1 character long
    while(nameLength < 2){
      
      System.out.println("What is your name?");
    
      //get answer from console
      answer = input.next();
      
      //now check if each character is a letter
      while(flag){

        //use a for-loop because we know how many letters it has
        for(int index = 0; index < answer.length(); index++){

          //check if the character is a letter or number
          if(!Character.isLetter(answer.charAt(index))){ //if it's not a letter
            flag = true;
            System.out.println("Please enter in a name that only has letters!");
            answer = input.next();
            break; //gets out of current loop
          }//end if
          else{
            flag = false;
          }
        }//end of for-loop

        //if no non-letters were found, exit while loop
        if(!flag){
          flag = true;
          break;
        }
      } //end of while
      
      //check if name is less than 2 characters
      if(answer.length() < 2){
      System.out.println("Please enter in a name that is at least "
                        + "two letters");
      }
  
      nameLength = answer.length(); //update length of answer
      
    } //end while loop
    
    if(nameLength >= 2 && flag){
      System.out.println("Welcome, " + answer);
    }
   
  } //end of main method
  
} //end of class