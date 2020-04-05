
public class PatternMatching {

	public static void main(String[] args) {
		int i , j;
		
		
		// priting pattern 
		//	*
		//	**
		//	***
		//	****
		
		for(i =1; i<=4; i++) {
				
			for(j =1 ;j<=i;j++) {
				
				System.out.printf("*");
			}
		System.out.println();
		}
		
		System.out.println();
		
		//priting pattern 
		
		// ****
		// 	***
		// 	 **
		// 	  *
		
		for(i =1; i<=4; i++) {
			
			for(j =1 ;j<=4;j++) {
				if(i==j || j>i) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
		     }
			System.out.println();
	    }
		
		
		System.out.println();
		
		
		// Printing Pattern
		// ****
		// ***
	    // **
	    // *
		
		for(i =1; i<=4; i++) {
			
			for(j =1 ;j<=5-i;j++) {
				
				System.out.printf("*");
			}
		System.out.println();
		}
		
		
		System.out.println();
		
		// Printing Pattern
		//    *
		//   **
	    //  ***
	    // ****
		
		for(i =4; i>=1; i--) {
			
			for(j =1 ;j<=4;j++) {
				if(j == i || j>i) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
		     }
			System.out.println();
	    }
		
		System.out.println();
		
		// Printing Pattern
		// ****
		// *  *
	    // *  *
	    // ****
		
		for(i =1; i<=4; i++) {
			
			for(j =1 ;j<=4;j++) {
				if(j==1||j==4||i==1||i==4) {
				System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
		     }
			System.out.println();
	    }
		
	}
}
