package hello;

import java.util.Scanner;

public class ReverseArrayEX {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        for (int i = 0; i < n / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[n - 1 - i];
	            arr[n - 1 - i] = temp;
	        }

	        System.out.println("\nReversed array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        scanner.close();


	}

}
