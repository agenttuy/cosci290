/*
  Author: Sina
  
  This class has been updated to use a Utility class to read a file for 
  all output.
  
*/

import java.util.Scanner;

public class GameDriver{
  
  public static void main(String[] args){
    
    //variable declarations with default values
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    Utility utility = new Utility();
    int numberOfStudents = 0;
    String teacherHairColor = "";
    int randomNum = 0;
    int minimum = 1; //set min for range for random numbers
    int maximum = 10; //set max for range for random numbers
 
      
    //Splash Screen
    System.out.println("                 _____                _                 _      \n"
                   +   "   /\\/\\  _   _  /__   \\___  __ _  ___| |__   ___ _ __  (_)___  \n"
                   +   "  /    \\| | | |   / /\\/ _ \\/ _` |/ __| '_ \\ / _ \\ '__| | / __| \n"
                   +   " / /\\/\\ \\ |_| |  / / |  __/ (_| | (__| | | |  __/ |    | \\__ \\ \n" 
                   +   " \\/    \\/\\__, |  \\/   \\___|\\__,_|\\___|_| |_|\\___|_|    |_|___/ \n"
                   +   "       |___/                                                   \n"
                   +   "    ___                        ___ _       _          _        \n"
                   +   "   / __\\ __ ___  _ __ ___     / _ \\ |_   _| |_ ___   / \\       \n" 
                   +   "  / _\\| '__/ _ \\| '_ ` _ \\   / /_)/ | | | | __/ _ \\ /  /       \n"
                   +   " / /  | | | (_) | | | | | | / ___/| | |_| | || (_) /\\_/        \n"
                   +   " \\/   |_|  \\___/|_| |_| |_| \\/    |_|\\__,_|\\__\\___/\\/          \n");
    
    //story setup
    utility.readFile("TextAdventureOutput.txt");
    
    numberOfStudents = input.nextInt(); //get number of students from user and assign to numberOfStudents variable declared above
      
    System.out.println("\nThere are ONLY " + numberOfStudents + " student(s) in class with you? WEIRD!");
    System.out.println("And what?! What color is your teacher's hair???");
    
    teacherHairColor = input.next(); //get hair color fro user input and assign to teacherHairColor variable declared above
    
    System.out.println("\nWEIRD!! Your teacher has " + teacherHairColor + " hair?! RUN!!!!");
    
    //get a random number
    randomNum = minimum + (int)(Math.random() * maximum);
    
    //randomize if a student runs with 70% probability
    if(randomNum > 3){
      System.out.println("\nA student runs out!!");
    }
    else{
      System.out.println("\nNo one is freaked out...");
    }
    
    
    //game over
    System.out.println();
    System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                     + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                     + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                     + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                     + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                     + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                     + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n"
                     + "  ___    ____                                                                   \n" 
                     + " |   |  |    |                                                                  \n" 
                     + " |___| |    _|                                                                  \n" 
                     + "  ___  |   |                                                                    \n" 
                     + " |   | |   |                                                                    \n" 
                     + " |___| |   |_                                                                   \n" 
                     + "        |____|                                                                  \n");
    
  }
  
}