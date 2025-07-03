//Problem statement
//Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
//
//Do this recursively.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= Length of String S <= 10^6
//
//Sample Input :
//abacd
//a x
//Sample Output :
//xbxcd



package recursion;
import java.util.Scanner;
public class ReplaceCharacters {
	public static String replaceCharacter(String str,char a,char b) {
		if(str.length()==0) {
			return "";
		}
		String smallString = replaceCharacter(str.substring(0,str.length()-1),a,b);
		if(str.charAt(str.length()-1)==a) {
			return smallString+b;
		}else {
			return smallString+str.charAt(str.length()-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String str2 = s.next();
		char a = str2.charAt(0);
		char b = str2.charAt(1);
		System.out.println(replaceCharacter(str,a,b));
	}
}
