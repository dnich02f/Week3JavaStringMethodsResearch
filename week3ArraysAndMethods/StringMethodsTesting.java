package week3ArraysAndMethods;

public class StringMethodsTesting {

	public static void main(String[] args) {

		
		
		String testString = "Free stuff";
		// It is good to use .toUpperCase before searching for a specific character in a string so that it effectively become case insensitive.
		String testStringUpper = testString.toUpperCase();
		System.out.println(testStringUpper);
		
		// It is good to use .toLowerCase before searching for a specific character or substring in a string so that it effectively become case insensitive.
		String testStringLower = testString.toLowerCase();
		System.out.println(testStringLower);
		
		// .indexOf() is useful for data validation to ensure that there is a dash at index 5 for values that have a limited length
		String[] extendedZipCode = {"50000-001", "50001-001", "50002-001"};
		for (String zip : extendedZipCode) {
		int positionOfDash = zip.indexOf("-");
		System.out.println(zip + " Position of dash is at index: " + positionOfDash);
		}
		
		String[] productCode = new String[5];
		productCode[0] = "R-001";
		productCode[1] = "R-002";
		productCode[2] = "R-003";		
		productCode[3] = "R-004";
		productCode[4] = "Z-001";
		
		int numProductSeriesR = 0;
		int numProductSeriesOther = 0;
		
		// .startWith() would be useful to identify how many product codes in inventory begin with R.
		for (String product : productCode) {
			if (product.startsWith("R")) {
				numProductSeriesR +=1; 
			} else {
				numProductSeriesOther += 1;
			}
		}
		
		System.out.println("There are " + numProductSeriesR + " product code(s) that begin with R currently in inventory.");
		System.out.println("There are " + numProductSeriesOther + " product code(s) that begin with characters other than R currently in inventory.");
	

	
		// .concat() combined with .startsWith() would be useful to add a location of each product in warehouse to their code
		for (String product : productCode) {
			if (product.startsWith("R")) {
				product = product.concat("-W."); 
			} else {
				product = product.concat("-E");
			} System.out.println(product);
		} 
	
	
	
	
	}
}
