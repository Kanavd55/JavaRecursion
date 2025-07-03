package recursion;
import java.util.Scanner;
public class isArraySorted {
	
	public static boolean isArraySorted(int[] arr) {
		if(arr.length == 0 || arr.length == 1) {
			return true;
		}
		
		if(arr[arr.length-1]<arr[arr.length-2]) {
			return false;
		}else {
			return true;
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
		System.out.println(isArraySorted(arr));
	}
}
