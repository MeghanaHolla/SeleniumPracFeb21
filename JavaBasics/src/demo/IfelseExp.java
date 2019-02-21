package demo;

import java.util.Scanner;

public class IfelseExp {
	
	public static void main(String[] args) {
		String choice;
		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.println("Which coffee you like Small/Medium/Large?");
		choice = k.nextLine();
		if(choice.equals("Small")) {
			System.out.println("Prize is 1$");
		}
		else if(choice.equals("Medium")) {
			System.out.println("Prize is 2$");
		}
		else if(choice.equals("Large")) {
			System.out.println("Prize is 3$");
		}
	}

}
