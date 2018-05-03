/*
  Author: Sina
  
  Purpose: Play around with loops
*/

public class TestLoops{

   //entry point of program
   public static void main(String[] args){
     
     int counter = 0;
     
     for(int i = 1; i <= 100;i++){ //i++ is the same as i = i + 1
       //i+=2 is the same as i = i + 2
       
       if(i % 3 == 0){
        counter++;
        System.out.print(i + " ");
       }
       
       if(counter % 5 == 0){
         System.out.println();
       }
     }
    
     
   }//end of main
}//end of class