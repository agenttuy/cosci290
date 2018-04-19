/*
  Author: Sina
  
  This class reads a text file that is located in the same folder. 
  It goes through every line of the text file and prints the line
  until the end of the file.
  
  Lab:
  Go through your text adventure for any string literals that is hardcoded
  programmatically. Put such text in a text file keeping in mind appropriate 
  organization for the flow of your text adventure.

*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIO{

  //start of test program
	public static void main(String[] args) {
  
		String sCurrentLine; //this variable will hold the line read in the file 
	  String FILENAME = "Test.txt"; //variable that holds the relative path of file
    
    //try opening the file
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

      //go through each line in the file, if it's not null and print
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

    //catch a file IO error and print stack trace
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}