package week3ArraysAndMethods;

public class Wee3LabPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print out a greet but method returns nothing
		greet("Tom");
		
		// return a greet but do not print
		greet2("Nick");
		
		/**
		 * Analyze the difference between the two methods - what do you find? How are they different?
		 * 
		 * If there is not a sysout print statement in either the creation or execution of the method, the nothing will print
		 * You cannot store a valua as a variable when using void
		 * Using the keyword return in the method will RETURN the data type when it is executed, thus allowing the user
		 * to store the value as a variable for future use
		 */
	
		
		// Is length of string greater than int number?
		System.out.println(isStringLongerThanNumber("Darryl", 3));
		
		// test a method that takes an array of double and returns the average
		double[] groceryPrices = {10.99, 15.99, 19.99};
		System.out.println(averageOfArray(groceryPrices));
		
		// Is string in array?
		String[] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		System.out.println(arrayStringCheck(names, "sam"));
		
		// Find smallest number
		int[] myArray = new int[6];
		myArray[0] = 1;
		myArray[1] = 5;
		myArray[2] = 2;
		myArray[3] = 8;
		myArray[4] = 13;
		myArray[5] = 6;
		
		int smallestNum = returnSmallestNum(myArray);
		System.out.println(smallestNum);
		
		
		
	}
 
	/**
	 * Write and test a method that takes a String name and prints out a greeting, this method returns nothing
	 */
	
	public static void greet(String name) {
		System.out.println("Hello " + name + "!");
	}
	
	/**
	 * Write and test a method that takes a String name and retuns a greeting, do not print in the method 
	 */
	
	public static String greet2(String name) {
		return ("Hi " + name + "!");
	}
	
	/**
	 * Write and test a method that takes a String and an int and returns true if the number of letters
	 * in the string is greater than the int
	 */
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		

		return string.length() > number;
//		if (string.length() > number) {
//		return true;	
//		} else {
//			return false;
//		}
	}
		
	/**
	 * Write and test a method that takes an array of double and returns the average
	 */
		
	public static double averageOfArray(double[] myArray) {
		double sum = 0;
		for (double num : myArray) {
			sum += num;
		}
		return (sum / myArray.length); 
	}
		
		
	/**
	 *  Write and test a method that takes an array of string and a string and returns true
	 *  if the string passed in exists in the array
	 */
	
	public static boolean arrayStringCheck(String[] stringArray, String string1) {
		for (String stringInArray : stringArray) {
			if (stringInArray.equals(string1)) {
				return true;
			}   
		} return false;
	}
	
	
	/**
	 *  Write and test a method that takes an array of int and returns the smallest number in the array
	 */
	
	public static int returnSmallestNum(int[] numArray) {	
		int smallest = numArray[0];
		for (int num : numArray) {
			if (num < smallest) {
				smallest = num;
			}
		} return smallest;
	}
	
	
	
	
	
	
	
	
	
	
	}