import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		 int  j  , a =0 , b = 1 , temp;
		 
		 // number of fibonacci series required 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 
		 int n = sc.nextInt();
		 
		 System.out.println(b);
		 
		 for(j = 1 ; j <= n ; j++) {
			 temp = a + b;
			 System.out.println(temp);
			 a = b;
			 b = temp;
			 	 
		 }
		 
	}

}
