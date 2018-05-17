public abstract class Animal{

  //instance variables
  private boolean isAlive;
  
  //constructors
  public Animal(){
    this.isAlive = true;
  }
  
  //getters and setters
  public boolean getIsAlive(){
    return this.isAlive;
  }
  
  public void setAlive(boolean isAlive){
    this.isAlive = isAlive;
  }
  
  //object info
  public String toString(){
    return "Animal: isAlive - " + this.isAlive; 
  }
  
  public abstract void eat();
  
}