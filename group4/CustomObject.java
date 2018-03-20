/*
  Author: Sina
  
  This is the highest object in my text adventure
  
*/

public class CustomObject{
  
  //list of attributes that private
  private int id;
  
  //custructors
  public CustomObject(){
    
    this.id = 0;
  }
  
  //accessors and mutators
  public void setId(int id){
    this.id = id;
  }
  
  public int getId(){
    return this.id;
  }
  
  //toString method
  public String toString(){
    return "Custom Object: " + this.id;
  }
  
  
}