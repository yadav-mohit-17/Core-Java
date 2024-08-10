// Check the String start with M

package test;
import java.util.function.*;

public class Predicate_CheckStringStartWith {

	public static void main(String[] args) {
		String[] str= {"Mohit","Nihit","Mohan","Chandan","Deepak","chillu"};
		Predicate<String> P = s -> s.charAt(0)=='M';
		System.out.print("The String Starts With M Are :");
		for(String st : str) {
			if(P.test(st)) {
				System.out.print(st+", ");
			}
		}
	}
}
