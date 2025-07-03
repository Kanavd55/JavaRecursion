package recursion;

import java.util.Scanner;

public class LastIndex {
	public static int lastIndex(int input[], int x) {
		if(input.length == 1) {
			return input[0] == x ? 0 : -1;
		}
		int[] smallerArray = new int[input.length-1];
		for(int i =0;i<input.length-1;i++) {
			smallerArray[i]=input[i];
		}
		if(input[input.length-1]==x) {
			return input.length-1;
		}else {
			return lastIndex(smallerArray,x);
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
		int n = s.nextInt();
		System.out.println(lastIndex(arr,n));
	}
}
