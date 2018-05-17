/*
  Author: Sina Tuy
  This class is the student object used for my text adventure.
*/

public class Student{
  
  //class attributes
  private double gpa;
  private String major;
  
  //zero-argument default constructor
  public Student(){
    this.gpa = 0.0;
    this.major = "undecided";
  }
  
  //overloaded constructor
  public Student(double gpa, String major){
    this.gpa = gpa;
    this.major = major;
  }
  
  public double getGpa(){
    return this.gpa;
  }
  
  public void setGpa(double gpa){
    this.gpa = gpa;
  }
  
  public String getMajor(){
    return this.major;
  }
  
  public void setMajor(String major){
    this.major = major;
  }
  
  /*
  public String toString(){
    return "Student = GPA: " + this.gpa + " Major: " + this.major;
  }*/
  
}