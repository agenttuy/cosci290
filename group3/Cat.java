public class Cat extends Animal{
  
  //instance variable
  private int numberOfLives; 
  
  //constructors
  public Cat{
    super();  
    this.numberOfLives = 9;
  }
  
  //getters and setters
  public int getNumberOfLives(){
    return this.numberOfLives;
  }
  
  public void setNumberOfLives(int numberOfLives){
    this.numberOfLives = numberOfLives;
  }
  
  //object info
  public String toString(){
    return super.toString() + " Cat: number of lives - " + this.numberOfLives;
  }
  
  @Override
  public void eat(){
    
    System.out.println("eats fish...");
  }
  
}