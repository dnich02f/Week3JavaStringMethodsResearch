package week3ArraysAndMethods;

public class MoreMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/** 
		 * Takes an array of ints and returns the sum of all the ints
		 */
//		int[] myArray = new int[3];
//		myArray[0] = 7;
//		myArray[1] = 10;
//		myArray[2] = 8;
//		
//		System.out.println(sumArray(myArray));
//		;
		
		/**
		 *  Takes an array of double and returns the average of all elements in the array
		 */
		
		double[] grades = new double[4];
		grades[0] = 98;
		grades[1] = 80;
		grades[2] = 72;
		grades[3] = 80;
		
		double avgOfGrades = calculateAverageArray(grades);
		System.out.println(avgOfGrades);
		
	}

	
	/**
	 *  Takes an array of ints and returns the sum of all the ints
	 */
	
	public static int sumArray(int[] numbers) {
		
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	/**
	 *  Takes an array of double and returns the average of all elements in the array
	 */
	
	public static double calculateAverageArray(double[] numbers) {
		
		double sum = 0;
//		double numOfElements = 0; ----------------------------USING arrayName.length aka "numbers.length"
		for (double number : numbers)  {
			sum += number;
//			numOfElements += 1; ------------------------------USING arrayName.length aka "numbers.length"
		}
//		double averageOfArray = (sum / numOfElements); -------USING arrayName.length aka "numbers.length"
		double averageOfArray = (sum / numbers.length);
		return averageOfArray;
	}
	
	
	/**
	 *  Takes a String and an int and returns the String concatenated with itself 
	 *  int number of times
	 */
	
	
	
	
	
	
}
