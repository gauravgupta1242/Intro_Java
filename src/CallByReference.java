// Call  by Refernece

public class CallByReference {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(); // Default Constructor
		
		r1.length = 10.0f;
		
		// calling modify method 
		modify(r1);
		
		// values of r1.length got change to that initiated by r2 object  in modify method.
		// after calling the method both r1 and r2 point toward the same object in the heap memory.
		System.out.println(r1.length);
		
		
	}
	
	// new object r2 is created
	// reference object r2 is passed // Call by reference
	public static void modify(Rectangle r2 )
	{
		r2.length = 40; 
		System.out.println(r2.length);
	}

}


class Rectangle
{
	float length;
	
	public Rectangle()
	{
		
	}
}
