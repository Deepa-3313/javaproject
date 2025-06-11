package hello;
import java.util.*;
public class SortAlphabeticalEx {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no.of strings:");
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] strings=new String[n];
		for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
		Arrays.sort(strings);
		System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();

	}

}
