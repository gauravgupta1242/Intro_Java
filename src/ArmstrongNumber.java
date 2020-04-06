// Armstrong Number Checking 
// Armstrong Number are cube of digits of number gives same number


import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 int  m;
		 
		 System.out.println("Enter the number ");
		 
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 sc.close();
		 
		 m = isArmstrong(n);
		 
		 if(m == n)
			 System.out.printf("%d  is Armstrong  Number",n);
		 else
		 {
			 System.out.printf("%d  is not Armstrong Number",n);
		 }
		
	}
	
	
	
	// Method return cube of each digit of number
	
	public static int isArmstrong(int n) {
		int sum = 0 , a;
		
		while(n>0)
		{
			a = n%10;
			sum = sum + a*a*a;
			n = n/10;
		}
		return sum;
	}

}




