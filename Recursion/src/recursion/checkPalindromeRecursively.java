//Problem statement
//Determine if a given string �S� is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.
//
//Note: You are not required to print anything, just implement the function. Example:
//Input: s = "racecar"
//Output: true
//Explanation: "racecar" is a palindrome.
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1:
//abbba
//Sample Output 1:
//true
//Explanation Of Sample Input 1 :
//�abbba� is a palindrome
//Sample Input 2:
//abcd
//Sample Output 2:
//false
//Explanation Of Sample Input 2 :
//�abcd� is not a palindrome.
//Constraints:
//0 <= |S| <= 10^6
//where |S| represents the length of string S.


package recursion;
import java.util.Scanner;
public class checkPalindromeRecursively {
	
	public static String reverseString(String str) {
		if(str.length()==0) {
			return "";
		}
		return reverseString(str.substring(1,str.length()))+str.charAt(0);
	}
	public static boolean isPalindrome(String str) {
        // Write your code here.
		if(str.length()==0 || str.length()==1) {
			return true;
		}
		
		return str.equals(reverseString(str));
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(isPalindrome(str));
	}
}
