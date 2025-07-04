//Problem statement
//Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//0 <= |S| <= 1000
//where |S| represents length of string S.
//Sample Input 1 :
//hello
//Sample Output 1:
//hel*lo
//Sample Input 2 :
//aaaa
//Sample Output 2 :
//a*a*a*a



package recursion;
import java.util.Scanner;
public class PairStar {
	public static String addStars(String s) {
		// Write your code here
		if(s.length()==1) {
			return s;
		}
		String smallerString = addStars(s.substring(0,s.length()-1));
		if(smallerString.charAt(smallerString.length()-1)==s.charAt(s.length()-1)) {
			return smallerString+"*"+s.charAt(s.length()-1);
		}else {
			return smallerString+ s.charAt(s.length()-1);
		}

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(addStars(str));
	}
}
