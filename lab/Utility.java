import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility{
  
  /**
    This file takes in a relative file path
    and reads and prints out each line in the file
  **/
  public void readFile(String FILENAME){
    
    String sCurrentLine; //this variable will hold the line read in the file 
    
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
 
  
}//end class