// Constructor Overloading 
// Class with multiple constructor defined


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abcd obj = new Abcd(); // Default Constructor called
		
		// Abcd obj = new Abcd(5); // This will called the parameterised constructor

	}

}

class Abcd 
{
	public Abcd()
	{
		System.out.println("This is default constructor");
	}
	
	public Abcd(int n)
	{
		System.out.println("This is parameterised constructor.");
	}
}


