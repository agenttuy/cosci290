/*
  Author: Sina T.
  Purpose: This is test sublcass for Armor
*/
public class Helmet extends Armor{
  
  private int durability;
  
  public Helmet(){    
    this.durability = 100;    
  }
  
  public int getDurability(){
    return this.durability;
  }
  
  public void setDurability(int durability){
    this.durability = durability;
  }
  
  public String toString(){
    return "The durability of this helmet is " + this.durability;
  }
  
}