/*

  Author: Sina Tuy
  This class tests the Student class
  
*/

public class TestStudent{
  
  public static void main(String[] args){
    Student student1 = new Student();
    
    //testing if default constructor and toString works 
    System.out.println(student1); 
    
    //update GPA
    student1.setGpa(3.5);
    
    //print out update of gpa
    System.out.println(student1);
  }
  
}