package week3ArraysAndMethods;

public class ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// keep track of names of students as teacher
		
//		String studentName1 = "Tom Sawyer";
//		String studentName2 = "Jack Smith";
//		String studentName3 = "Bill Turner";
		
		
		// tool for similar data, to group it together. ARRAY, holds multiple variables
		// [] means it is an array
		// Array is an object and must use new
		// [3] means that there will be 3 elements in it
		// access element in an array
		
		String[] students = new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
//		System.out.println(students[0]);
//		System.out.println(students[1]);
//		System.out.println(students[2]);
		
		System.out.println("FOR LOOP WITH ARRAY: ");
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		
		
		// print out every element in an array - ENHANCED FOR LOOP
		// for each (for) student (student) in (:) students (students)
		System.out.println("ENHANCED FOR LOOP WITH ARRAY: ");
		
		for (String student : students) {
			System.out.println(student);
		}
		
		
		
	}

}
