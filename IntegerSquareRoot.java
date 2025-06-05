package hello;

import java.util.Scanner;

public class IntegerSquareRoot {
		public static int binarySqrt(int n) {
	        if (n == 0 || n == 1) return n;

	        int start = 1, end = n, ans = 0;

	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            if (mid <= n / mid) {
	                ans = mid;
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to find its square root: ");
	        int number = scanner.nextInt();
	        int result = binarySqrt(number);
	        System.out.println("Integer part of square root: " + result);

	}

}
