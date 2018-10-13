package week1.day1;

public class Bicycle {

	// Actions ride, bell, brake, clean, park, puncture, sit, paint
	// doRide, ringBell, applyBrake, doClean, doPark, isPuncture, doSit -> methods

	//information model, color, brand, no of wheels, basket, owner, height
	//cycleColor, cycleBrand, numWheels, hasBasket, ownerName -> variables
	//variable syntax
	//classlevel, methodlevel, blocklevel, argumentvariable -> based on the scope
	//accessModifier dataType varName = value -> class level
	public int numWheels = 2;
	boolean hasBasket = true;
	
	//method syntax
	//accessModifier returnType methodName (inputs)
	//access modifier -> public, private, protected, default(package) 
	//returnType -> output in a specified format(text, number, decimal, binary)
	//most commonly used - String, int, boolean, char, void(no return type)
	//input args - > 

	public void doRide() {
		// placeholder for logic	
	}

	public String getCycleColor() {
		return "red";
	}

	public String getCycleColor(String whose) {
		if(whose.equals("Son")) {
			return "red";
		}
		else if(whose.equals("Daughter")) {
			return "pink";
		}
		else {
			return "white";
		}
	}

	public String getCycleColor(String whose, int brand) {
		if(whose.equals("Son")&&brand==2) {
			return "red";
		}
		else if(whose.equals("Daughter")) {
			return "pink";
		}
		else {
			return "white";
		}
	}

















}
