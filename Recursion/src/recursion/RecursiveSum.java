package recursion;
import java.util.Scanner;
public class RecursiveSum {
	
	public static int recursiveSum(int n) {
		if(n==0) {
			return 0;
		}
		return n+recursiveSum(n-1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(recursiveSum(n));
	}
}
