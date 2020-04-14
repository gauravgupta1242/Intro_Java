// Counting the number of objects being created

public class CountNumberOfObjects {

	public static void main(String[] args) {
		
		B obj1 = new B();
		B obj2 = new B();
		B obj3 = new B();
		
		obj1.Counter(); // Count the objects
		obj3.Counter();
	}

}

class B
{	
	static int count ;
	public  B() // Constructor
	{
		count ++;
	}
	
	public void Counter()
	{
		System.out.println(count);
	}
}
