// Check Prime or not 
// Prime number are divisible by number itself and one.

import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		int a ;
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		String b = isPrimeNumber(number);
		System.out.println(b);
	}
	
	
	// Method Return String if its a prime or not
	
	public static String isPrimeNumber(int n)
	{
		int i ;
		String s = "";
		
		
		for (i = 2 ; i < n ; i++)
		{	
			// Check if once if any factor is present
			// Then break and return string s 
			
			if(n % i == 0)
				{
				s = "The number is not Prime Number";
				break;
				}
			else
				s = "The number is Prime Number";
		}
		
		return s;
	}
}
