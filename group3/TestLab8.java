/*
  Author: Sina Tuy
  Demo for lab 8 for group 3
*/

public class TestLab8{
  
  //main method
  public static void main(String[] args){
  
   //declare an array of students
   Student[] students = new Student[5];
  
    //instantiate each Student object
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();
    
    //add student object to array
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    students[3] = s4;
    students[4] = s5;
    
    //Setting properties for each student object
    s1.setGpa(3.4);
    s1.setMajor("Computer Science");
    s2.setGpa(2.3);
    s2.setMajor("English");
    s3.setGpa(1.7);
    s3.setMajor("Engineering");
    s4.setGpa(5.0);
    s4.setMajor("Theater");
    s5.setGpa(2.7);
    s5.setMajor("Math");
    
    //passing the array of students above into custom function
    printStudents(students);
    
    //change student info
    s5.setMajor("Undecided");
    
    //reprint results
    printStudents(students);
                                          
 }//end of main
  
  
 /*
  This functinos prints an array of Student objects
 */
 public void printStudent(Student[] students){
    
   //printing information of each student after setting properties
    for(int i = 0; i < students.length; i++) {
      System.out.println(students[i].toString());
    }
 }//end printStudent
  
}