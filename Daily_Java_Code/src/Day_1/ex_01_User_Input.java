package Day_1;

import java.util.Scanner;

public class ex_01_User_Input {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("User Input from agrg");
			String age_string = args[2];
			int age = Integer.parseInt(age_string);
			System.out.println("The age from agrs is : "+age);
			
			System.out.println("User Input from Scanner");
			Scanner sc = new Scanner(System.in);
			age = sc.nextInt();
			System.out.println("The age from scanner is : "+age);
			
			// Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);
	
	        // Prompt the user for input
	        System.out.print("Enter your name: ");
	        // Read a line of text entered by the user
	        String name = scanner.nextLine();
	        // Prompt the user for a number
	        System.out.print("Enter your age: ");
	        // Read an integer entered by the user
	        age = scanner.nextInt();
	        // Display the user's input
	        System.out.println("Hello, " + name + "! You are " + age + " years old.");
	        // Close the Scanner to release resources (optional)
	        scanner.close();
		
	}

}
