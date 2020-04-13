// Constructor 

public class Constructors {

	public static void main(String[] args) {
		
		Abc obj = new Abc(); // Constructor
		
		// No need to call constructor
		// By Default while defining the constructor its is called
		
		// Properties of constructor:
		// 1. It is a member method 
		// 2. Its name is same as class name.
		// 3. It never return any value.
		// 4. It is used to allocate thr memory.
		
	}

}


class Abc
{
	public Abc()
	{
		System.out.println("This is const.");
	}
}

