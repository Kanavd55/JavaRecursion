package recursion;
import java.util.Scanner;
public class ArrayEquilibriumIndex {
	
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i =0; i<n;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}

	
	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int equil=0;
		int leftSum=0;
		int RightSum=0;
		for(int i=1;i<arr.length;i++) {
			RightSum=RightSum+arr[i];
		}
		for(int i=0;i+1<arr.length;i++) {
			if(leftSum==RightSum) {
				equil=i;
				break;
				
			}
			RightSum=RightSum-arr[i+1];
			leftSum=leftSum+arr[i];
		}
		return equil;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int[] arr=TakeArrayInput();
			System.out.println(arrayEquilibriumIndex(arr));
			
		}
	}
}
