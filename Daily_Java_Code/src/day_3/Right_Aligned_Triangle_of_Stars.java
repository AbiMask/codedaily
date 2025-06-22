package day_3;

public class Right_Aligned_Triangle_of_Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		for(int i = 1;  i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
