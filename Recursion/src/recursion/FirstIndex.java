package recursion;

import java.util.Scanner;

public class FirstIndex {
	
	public static int firstIndex(int input[], int x) {
		if(input.length == 1) {
			return input[0] == x ? 0 : -1;
		}
		int[] smallerArray = new int[input.length-1];
		for(int i =0;i<input.length-1;i++) {
			smallerArray[i]=input[i];
		}
		int isSmallerArray;
		isSmallerArray = firstIndex(smallerArray,x);
		if(isSmallerArray != -1) {
			return isSmallerArray;
		}
		if(input[input.length-1]==x) {
			return input.length-1;
		}else {
			return -1;
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
		System.out.println(firstIndex(arr,n));
	}
}
