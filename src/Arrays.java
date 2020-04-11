import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		int a[] = new int[20];
		// Generate a random values within range provided
		Random r = new Random();
		
		// Initialize the array with random values
		// Array is Object in Java 
				
		for (int i = 0 ; i < a.length ; i++)
		{
			a[i] = r.nextInt(50);
		}
		
		// Retrieving Values from array by looping overby 
		//length of array to be displayed
		
		for (int i = 0 ; i<5 ; i++)
			System.out.println(a[i]);
		
		// Revtrive all the values from array 
		// Enhanced for loop
		System.out.println("Retrive all values from array usind Enhanced for loop.");
		
		// There i is the values from array a not index
		
		for(int i : a)
			System.out.println(i);
		
	}

}
