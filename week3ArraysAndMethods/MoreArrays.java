package week3ArraysAndMethods;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1. Declare Data Type
		// Step 2. place [] next to the declared data type "String[]"
		// Step 3. Declare the array name
		// Step 4. insert keyword "new"
		// Step 5. Declare number of elements for the array "String[5]"
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println(product);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
	
		
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println(multiplesOf5[i]);
		}
		
		
	}

}
