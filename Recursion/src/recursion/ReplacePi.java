package recursion;

import java.util.Scanner;

public class ReplacePi {
	
	public static String replacePi(String str) {
		if(str.length()==0) {
			return "";
		}
		if(str.charAt(0)=='P' && str.charAt(1)=='i') {
			return "3.14"+replacePi(str.substring(2));
		}else {
			return str.charAt(0)+replacePi(str.substring(1));
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(replacePi(str));
	}
}
