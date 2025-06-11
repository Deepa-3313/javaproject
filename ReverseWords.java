package hello;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String[] words = input.trim().split("\\s+");

	        System.out.println("\nReversed words:");
	        for (int i = words.length - 1; i >= 0; i--) {
	            System.out.print(words[i] + " ");
	        }

	        scanner.close();

	}

}
