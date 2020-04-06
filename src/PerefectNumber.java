// Check Perfect number 
// Perfect number are sum of its factor gives the same number

import java.util.Scanner;

public class PerefectNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();		
		
		boolean b = isPerfect(n);
		if(b)
			System.out.printf("%d is Perfect Number",n);
		else
			System.out.printf("%d is not Perfect Number",n);

	}
	
	// Define the method isPerfect()
	
	public static boolean isPerfect(int n ) {
		
		int sum = 0 ;
		
		for (int i = 1 ; i<= n/2 ; i++)
		{
			if(n%i == 0)
				sum += i;
		}
		
		if(n==sum)
			return true;
		
		return false;
		
	}
	
}
