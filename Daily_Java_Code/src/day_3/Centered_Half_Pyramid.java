package day_3;

public class Centered_Half_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
		    // Print leading spaces (2 spaces each)
		    for (int j = i; j < n; j++) {
		        System.out.print(" ");
		    }
		    
		    // Print stars with a space after each
		    for (int k = 1; k <= i; k++) {
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		}

	}

}
