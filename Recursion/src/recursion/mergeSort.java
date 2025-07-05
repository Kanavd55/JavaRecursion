//Problem statement
//You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.
//
//
//
//You must sort the elements between 'l' and 'r'.
//
//
//
//Note:
//Change in the input array itself. So no need to return or print anything.
//Example:
//Input: ‘N’ = 7,
//'ARR' = [2, 13, 4, 1, 3, 6, 28]
//
//Output: [1 2 3 4 6 13 28]
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1:
//7
//2 13 4 1 3 6 28
//Sample Output 1:
//1 2 3 4 6 13 28
//Explanation of Sample Output 1:
//After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
//Sample Input 2:
//5
//9 3 6 2 0
//Sample Output 2:
//0 2 3 6 9
//Explanation of Sample Output 2:
//After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
//Constraints :
//1 <= N <= 10^3
//0 <= ARR[i] <= 10^9



package recursion;

import java.util.Scanner;

public class mergeSort {
	
	 public static void mergeSort(int[] arr, int l, int r){
	        // Write your code here
		 if(l>r) {
			 return;
		 }
		mergeSort(arr,l+1,r);
		for(int i=l;i<r;i++) {
			if(arr[i]<arr[i+1]) {
				return;
			}else {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
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
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = TakeArrayInput();
		mergeSort(arr,0,arr.length-1);
		printArray(arr);
	}
}
