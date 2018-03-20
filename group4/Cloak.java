/*
	Mike Plata
	CoSci 290
	Cloak class
*/

public class Cloak extends Armor{
	
	
	
	//the Cloak class has one default constructor
	public Cloak() {
		
		//assigns the indicated string to the name property
		super.setName("Cloak");
		
		//assigns the indicated strong to the type property
		super.setType("Cloak");
		
		//assigns the indicated value to the defense property
		super.setDefense(4);
	}
}