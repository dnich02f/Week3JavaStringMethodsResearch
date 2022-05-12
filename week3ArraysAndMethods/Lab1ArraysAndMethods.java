package week3ArraysAndMethods;

public class Lab1ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * Create an array with the following values: 1, 5, 2, 8, 13, 6
		 */
		
		int[] myArray = new int[6];
		myArray[0] = 1;
		myArray[1] = 5;
		myArray[2] = 2;
		myArray[3] = 8;
		myArray[4] = 13;
		myArray[5] = 6;
		
//		System.out.println(myArray[0]);
		
		/**
		 * Print out the last in element in the above array without using [5]
		 */
		
//		System.out.println(myArray[myArray.length - 1]);
		
		/**
		 * Print out the element in the array at position 6 and -1. What happens?
		 */
		
//		System.out.println(myArray[6]);
//		// Index 6 out of bounds
		
//		System.out.println(myArray[-1]);
//		// Index -1 out of bounds
		
		
		/**
		 * Write a traditional for loop that prints out each element in the array
		 */
		
//		for (int i = 0; i < myArray.length; i++) {
//			System.out.println(myArray[i]);
//		}
		
		/**
		 * Write an enhanced for loop that prints out each element in the array
		 */
		
//		for (int number : myArray) {
//			System.out.println(number);
//		}
		
		
//		int sum = 0;
//		for (int number : myArray) {
//			sum += number;
//			System.out.println(sum);
//		}
		
		
		/**
		 * Create a new variable called average and assign the average value of the array to it
		 */
		
//		double sum = 0;
//		for (int number : myArray) {
//			sum += number;
//		}
//		double average = sum / myArray.length;
//		System.out.println(average);
		
		
		/**
		 *  Write an enhanced for loop that prints out each number in the array only if the number is odd
		 */
		
//		for (int number : myArray) {
//			if (number % 2 != 0) {
//				System.out.println(number);
//			}
//		}
//		
		
		/**
		 *  Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		 */
		
		String[] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		/**
		 * Calculate the sum of all the letters in the new array
		 */
		
//		int sumOfLettersInName = 0;
//		for (String name : names) {
//			sumOfLettersInName += name.length();
//		}
//		System.out.println(sumOfLettersInName);
		
	
		
		
	}

}
