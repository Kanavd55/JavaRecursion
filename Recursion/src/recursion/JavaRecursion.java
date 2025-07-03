package recursion;

public class JavaRecursion {
	public static int recursiveFactorial(int n) {
		if(n==0) {
			return 1;
		}
		return n * recursiveFactorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(recursiveFactorial(1));
	}
}
