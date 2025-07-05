package recursion;
import java.util.Scanner;
public class SumOfDigits {
	public static int sumOfDigits(int input){
		// Write your code here
		if(input/10==0) {
			return input;
		}
		int small = sumOfDigits(input/10);
		return small+input%10;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}
}
