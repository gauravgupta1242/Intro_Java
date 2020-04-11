
public class Arrays {

	public static void main(String[] args) {
		int a[] = new int[5];
		int i;
		
		// Initialize the array
		// Array is Object in Java 
		
		for ( i = 1 ; i < 5 ; i++)
		{
			a[i] = i + 1;
		}
		
		// Retrieving Values from array
		for (i = 0 ; i<5 ; i++)
			System.out.println(a[i]);
	}

}
