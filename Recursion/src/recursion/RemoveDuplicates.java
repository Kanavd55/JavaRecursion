//Problem statement
//Given a string S, remove consecutive duplicates from it recursively.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= |S| <= 10^3
//where |S| represents the length of string
//Sample Input 1 :
//aabccba
//Sample Output 1 :
//abcba
//Sample Input 2 :
//xxxyyyzwwzzz
//Sample Output 2 :
//xyzwz



package recursion;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length()==0) {
			return "";
		}
		int i =0;
		int j=i+1;
		while(j<s.length() && s.charAt(j)==s.charAt(i)) {
			j++;
		}
		return s.charAt(i)+removeConsecutiveDuplicates(s.substring(j));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(removeConsecutiveDuplicates(str));
	}
}
