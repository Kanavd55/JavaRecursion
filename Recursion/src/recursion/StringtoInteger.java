package recursion;
import java.util.Scanner;
public class StringtoInteger {
	public static int convertStringToInt(String input){
		// Write your code here
		if(input.length()==1) {
			return ((int)input.charAt(0))-48 ;
		}
		int smallerNum = convertStringToInt(input.substring(0,input.length()-1));
		return (smallerNum*10) + ((int)input.charAt(input.length()-1) - 48);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(convertStringToInt(str));
	}
}
