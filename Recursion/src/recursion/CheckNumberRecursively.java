package recursion;
import java.util.Scanner;
public class CheckNumberRecursively {
	
	public static boolean checkNumber(int input[], int x) {
		if(input.length ==1) {
			return input[0]==x;
		}
		int[] smallerArray = new int[input.length-1];
		for(int i =0;i<input.length-1;i++) {
			smallerArray[i]=input[i];
		}
		boolean isSmallerArray;
		isSmallerArray = checkNumber(smallerArray,x);
		if(isSmallerArray) {
			return true;
		}
		if(input[input.length-1]==x) {
			return true;
		}else {
			return false;
		}
		
		
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
		Scanner s = new Scanner(System.in);
		int[] arr = TakeArrayInput();
		int num = s.nextInt();
		System.out.println(checkNumber(arr,num));
	}
}
