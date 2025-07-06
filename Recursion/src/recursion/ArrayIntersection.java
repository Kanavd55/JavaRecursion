//Problem statement
//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
//
//Note :
//Input arrays/lists can contain duplicate elements.
//
//The intersection elements printed would be in ascending order.
//
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^4
//0 <= M <= 10^4
//
//Time Limit: 1 sec 
//Sample Input 1 :
//2
//6
//2 6 8 5 4 3
//4
//2 3 4 7 
//2
//10 10
//1
//10
//Sample Output 1 :
//2 3 4
//10
//Sample Input 2 :
//1
//4
//2 6 1 2
//5
//1 2 3 4 2
//Sample Output 2 :
//1 2 2
//Explanation for Sample Output 2 :
//Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.
//

package recursion;
import java.util.Scanner;
public class ArrayIntersection {
	
	//Brute force solution takes O(n2) Time complexity but what we will do is
	//we will sort the second array and then using binary search on the second array using first array element to find array intersection so
	//It will have the time complexity of O(nlogn)
	
	
	public static void InsertionSort(int[] arr) {
		if(arr.length==1) {
			return;
		}
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int element = arr[i];
			while(j>=0 && element<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
	}
	
	public static boolean BinarySearch(int[] arr,int element) {
		int start =0;
		int end =arr.length - 1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]>element) {
				end = mid -1;
			}else if(arr[mid]<element) {
				start = mid+1;
			}else {
				arr[mid]=-1;
				return true;
			}
		}
		return false;
	}
	
	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		InsertionSort(arr1);
		InsertionSort(arr2);
		 int i=0,j=0;
	        for(;i<arr1.length && j<arr2.length;) {
	            if(arr1[i]<arr2[j]) {
	                i++;
	            }else if(arr1[i]>arr2[j]) {
	                j++;
	            }else {
	                System.out.print(arr1[i]+" ");
	                i++;
	                j++;

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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int[] arr1 = TakeArrayInput();
			int[] arr2 = TakeArrayInput();
			intersection(arr1,arr2);
		}
	}
}
