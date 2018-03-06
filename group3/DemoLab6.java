/*
  Author: Sina Tuy
  
  The purpose of this application is to demo
  how to use custom objects in an array
*/

public class DemoLab6{
  
  //main method
  public static void main(String[] args){
    
    //declare an array of students
    Student[] students = new Student[10];
    
    //instantiate each Student object
    Student s1 = new Student();
    
    //add student object to array
    students[0] = s1;
    
    //print info based on default constructor
    System.out.println("Student gpa: " + students[0].getGpa());
    
    s1.setGpa(3.4);
    s1.setMajor("Computer Science");
    
    //print info after setting/updating info
    System.out.println("Student gpa: " + students[0].getGpa());
  }
}