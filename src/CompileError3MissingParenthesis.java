 class CompileError3MissingParenthesis {

	public static void main(String[] args) 
	{
		System.out.println("Printing 1 to 5");
		int i ; 
		
		// missing parenthesis , should have 
		// been for (i = 1 ; i<= 5; i++)
		for (i =1 ; i<= 5; i++ {
			System.out.println(i + "\n");
		}
		
		//Throws error as insert ") Statement" to 
		// complete ForStatement
	}

}
