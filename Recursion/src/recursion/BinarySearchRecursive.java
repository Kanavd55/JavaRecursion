package recursion;
import java.util.Scanner;
public class BinarySearchRecursive {
	
	public static int binarySearch(int[] arr,int si,int e,int x) {
		if(si>e) {
			return -1;
		}
		int mid = (si+e)/2;
		if(arr[mid]==x) {
			return x;
		}else if(arr[mid]<x) {
			return binarySearch(arr,mid+1,e,x);
		}else {
			return binarySearch(arr,si,mid-1,x);
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
		int x = s.nextInt();
		System.out.println(binarySearch(arr,0,arr.length-1,x));
	}
}
