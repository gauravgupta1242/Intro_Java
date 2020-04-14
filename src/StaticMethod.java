// Static Method
// Static Variable


public class StaticMethod {

	public static void main(String[] args) {
		
		// Way to instantiate static Variable
		// Can be called by the class no need to get object of class
		A.num2 = 5;
		
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new  A();
		
		// Way to instantiate non static variable
		// Need to get the class object 
		obj1.num1 = 1;
		obj2.num1 = 2;
		obj3.num1 = 3;
		
		// Way to call a static Method
		A.show(); // num2 = 9
		
		System.out.printf(" obj1 : %d \n obj2 : %d \n obj3 : %d",
				obj1.num1,obj2.num1,obj3.num1);
		
		// All static Variable can be accessed by all the non static method of class 
		System.out.printf("\n obj1 num2 is %d ",obj1.num2);
		System.out.printf("\n obj2 num2 is %d ",obj2.num2);
		System.out.printf("\n obj2 num2 is %d ",obj3.num2);
	
		
		// But a non-static variable can not be accessed in static method
	}

}

class A 
{
	int num1;
	
	// Static Variable 
	
	static int num2;
	
	// Static Method // add 'static' to method 
	public static void show()
	{
		num2 = 9;
	}
}

