//Problem statement
//Given an array of length N, you need to find and return the sum of all elements of the array.
//
//Do this recursively.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= N <= 10^3
//Sample Input 1 :
//3
//9 8 9
//Sample Output 1 :
//26
//Sample Input 2 :
//3
//4 2 1
//Sample Output 2 :
//7    


package recursion;
import java.util.Scanner;
public class SumofArray {
	
	public static int sum(int input[]) {
		if(input.length==1) {
			return input[0];
		}
		int[] smallerArray = new int[input.length-1];
		for(int i =0;i<input.length-1;i++) {
			smallerArray[i]=input[i];
		}
		return sum(smallerArray)+input[input.length-1];
	}
	
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i =0; i<n;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] arr = TakeArrayInput();
		System.out.print(sum(arr));
	}
}
