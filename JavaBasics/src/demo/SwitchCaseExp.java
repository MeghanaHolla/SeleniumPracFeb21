package demo;

import java.util.Scanner;

public class SwitchCaseExp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.println("What day is today?");
		String day = k.nextLine();
		switch(day) {
		case "Monday":
			System.out.println("Wear a white color dress today");
			break;
		case "Tuesday":
			System.out.println("Wear a Blue color dress today");
			break;
		case "Wednesday":
			System.out.println("Wear a brown color dress today");
			break;
		case "Thursday":
			System.out.println("Wear a Red color dress today");
			break;
		case "Friday":
			System.out.println("Wear a yellow color dress today");
			break;
		case "Saturday":
			System.out.println("Wear a Orange color dress today");
			break;
		case "Sunday":
			System.out.println("Wear a green color dress today");
			break;
		}
	}

}
