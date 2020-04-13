// Call By Value

public class CallByValue {

	public static void main(String[] args) {
		
		int r1 = 10;
		
		modify(r1);
		System.out.printf("Value of R1 is %d" ,r1);
		
		
	}
	
	// Primitive Type Passed 
	public static void modify(int r2 )
	{
		r2 = 40; 
		System.out.println("Value of R2 is " + r2);
	}

}


class Rectangles
{
	float length;
	
	public Rectangles()
	{
		
	}
}
