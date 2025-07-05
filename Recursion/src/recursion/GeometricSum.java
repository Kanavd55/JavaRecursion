package recursion;
import java.util.Scanner;
public class GeometricSum {
	public static double powerOfTwo(int n) {
		if(n==0) {
			return 1;
		}
		return 2 * powerOfTwo(n-1);
	}
	
	public static double geometricSum(int k) {
        // Write your code here
		if(k==0) {
			return 1;
		}
		double smallerSum=geometricSum(k-1);
		double power = powerOfTwo(k);
		return ((power*smallerSum) + 1)/power;
		
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(geometricSum(n));
	}
}
