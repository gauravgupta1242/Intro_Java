// Checking the Palindrome Number
// Palindrome Number are number == reverse of number
// i.e 121 == 121 

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 int  a , r;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int i = sc.nextInt();
		 sc.close();
		 int j = i;
		 
		 a = 0;
		 
		 while(i>0) {
			 r = i % 10;
			 a = a*10 + r;
			 i = i / 10;
			 
			 
		 }
		 
		 if (j == a) {
			 System.out.printf("The Number %d is Palindrome number",j);
		 }
		 else {
			 System.out.println("The number is not Palindrome number ");
		 }
	}

}
