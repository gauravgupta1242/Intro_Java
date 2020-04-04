
class ComileErrorIncorrectLoop {

	public static void main(String[] args)
	{	
		int a = 7 , ans ;
		int i;
		System.out.println("Multiplication Table of 7");
		for (i = 1, i <= 10; i++) {
			ans = a * i ;
			System.out.println(ans + "\n");
		}
		
		// Throws Syntax error on token ",", ; expected error
	}

}
