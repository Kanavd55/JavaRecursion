package recursion;

import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int[] arr,int s ,int e) {
		int element = arr[s];
		int count =0;
		for(int i=s+1;i<=e;i++) {
			if(element>arr[i]) {
				count++;
			}
		}
		arr[s]=arr[s+count];
		arr[s+count]=element;
		int pivotIndex = s+count;
		while(s<e) {
			if(arr[s]<arr[pivotIndex]) {
				s++;
			}else if(arr[e]>arr[pivotIndex]) {
				e--;
			}else {
				int temp=arr[e];
				arr[e]=arr[s];
				arr[s]=temp;
			}
		}
		return pivotIndex;
		
	}
	public static void quickSort(int[] arr, int s, int e){
		// Write your code here
		if(s>=e) {
			return;
		}
		int pivotIndex = partition(arr,s,e);
		quickSort(arr,s,pivotIndex-1);
		quickSort(arr,pivotIndex+1,e);
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
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}
}
