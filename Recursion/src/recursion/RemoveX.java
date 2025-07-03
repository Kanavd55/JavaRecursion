package recursion;
import java.util.Scanner;
public class RemoveX {
	
	public static String removeX(String input){
		// Write your code here
		if(input.length()==0) {
			return "";
		}
		String smallerString = removeX(input.substring(0,input.length()-1));
		if(input.charAt(input.length()-1)=='x') {
			return smallerString;
		}else {
			return smallerString+input.charAt(input.length()-1);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(removeX(str));
	}
}
