package recursion;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static int Fib(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int num = Fib(n-1) + Fib(n-2);
		return num;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Fib(n));
	}
}
