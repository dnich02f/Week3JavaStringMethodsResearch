package week3ArraysAndMethods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Modularize
		// Method is a write code and put a name on it by putting a name on it
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
	
		System.out.println(fullName);
		System.out.println(fullName2);
		
	}

	// method signature
	// public static is an access modifier, the access of the code
	// String - this is the DATA TYPE that the METHOD will return
	// Not all methods have to RETURN something - VOID instead of String
	// Any time you want to use the code IN a method, then use the Method name
	// Method name should be a verb since it will DO something
	// () the parenthesis can have nothing in them, or they can have parameters
	// Parameters are like parking spots, specifically when CREATING the METHOD
	// Arguments are the cars that park in the parking spots, specifically when CALLING the METHOD
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
//		OR
//		String fullName = x + " " + y;
//		return fullName;
	}
	
}
