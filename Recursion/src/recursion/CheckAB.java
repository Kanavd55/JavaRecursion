package recursion;
import java.util.Scanner;
public class CheckAB {
	
	public static boolean checkAB(String input) {
		if(input.length()==0) {
			return true;
		}
		if(input.charAt(0)=='a') {
			if(input.substring(1).length()>1 && input.substring(0,3).equals("bb")) {
				return checkAB(input.substring(3));
			}else {
				return checkAB(input.substring(1));
			}
		}else {
			return false;
		}
	}
	
//	Brute force solution
//	public static boolean checkAB(String input) {
//		// Write your code here
//		if(input.length()==0) {
//			return true;
//		}
//		else if(input.length()==1 && input.charAt(0)=='a') {
//			return true;
//		}else if(input.length()==1 && input.charAt(0)!='a') {
//			return false;
//		}
//		else if(input.length()==2 && input.charAt(0)=='a') {
//			return checkAB(input.substring(1));
//		}
//		else if(input.length()==3) {
//			if(input.substring(0,2).equals("aa")) {
//				return checkAB(input.substring(1));
//			}else if(input.substring(0,3).equals("abb")) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		else if(input.length()==4) {
//			if(input.substring(0,4).equals("aaaa")) {
//				return true;
//			}else if(input.substring(0,4).equals("abba")) {
//				return true;
//			}else if(input.substring(0,4).equals("aabb")) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		else if(input.length()>4) {
//			if(input.substring(0,2).equals("aa")) {
//				return checkAB(input.substring(1));
//			}else if(input.substring(0,3).equals("abb")) {
//				return checkAB(input.substring(3));
//			}else {
//				return false;
//			}
//		}
//		else {
//			return false;
//		}
//	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(checkAB(str));
	}
}
