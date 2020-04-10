// Swapping of the number

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		
		// Input from user
		int num1 , num2 ;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("The number are num1 : %d and num2 : %d ",num1 , num2);
		
		System.out.println("After Swapping ");
		
		int temp;
		// Swapping logic using a temp variable
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.printf("Number num1: %d and num2 : %d" , num1 , num2 );
		
	}

}
