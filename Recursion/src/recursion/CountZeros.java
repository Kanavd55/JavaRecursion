package recursion;
import java.util.Scanner;
public class CountZeros {
	public static int countZerosRec(int input){
		// Write your code here
		if(input== 0) {
			return 1;
		}
		if(input >0 && input < 10) {
			return 0;
		}
		if(input%10 == 0) {
		    return countZerosRec(input/10)+1; 
		}else {
			return countZerosRec(input/10);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
	}
}
