/*
  Mike Plata
  CoSci 290
  
  sample of an Armor class for Text Adventure
  to be used by the Player class
*/

public class Armor{

	//the Armor class has 2 properties
	private String name;
	private String type;
	private int defense;
	  
	//the Armor class has 1 defualt constructor
	public Armor(){
	
		//assigns the indicated String to the name property
		this.name = "None";
		  
		//assigns the indicated String to the type property
		this.type = "N/A";
		    
		//assigns the value of zero (0) to the defense property
		this.defense = 0;
	}
	
	//method to print (to screen) all class members with appropriate labels
	public void printArmor() {
		
		//print to screen the name property
		System.out.println("Name: " + this.name);
		
		//print to screen the type property
		System.out.println("Type: " + this.type);
		
		//print to screen the defense property
		System.out.println(" Def: " + this.defense);
	}
	  
	//method to set the name property
	public void setName(String newName){
	    
		//assigns the value of newName to the name property
		this.name = newName;
	}
	
	//method to return the value of the name property
	public String getName(){
		    
		//returns the value of the name property
		return this.name;
	}
	  
	//method to set the type property
	public void setType(String newType) {
		  
		//assigns the value of newType to type
		this.type = newType;
	}
	  
	//method to return the value of the type property
	public String getType() {
		  
		//returns the value of the type property
		return type;
	}
	  
	//method to set the defense property
	public void setDefense(int newValue){
	    
		//assigns the value of newValue to the defense property
		this.defense = newValue;
	}
	  
	//method to return the value of the defense property
	public int getDefnse(){
	    
		//returns the value of the defMod property
		return this.defense;
	}
	
	public String toString(){
		return this.type + " " + this.defense + " " + this.name;
	}
}