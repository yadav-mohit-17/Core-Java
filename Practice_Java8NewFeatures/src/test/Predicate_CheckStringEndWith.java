package test;
import java.util.function.Predicate;

public class Predicate_CheckStringEndWith {

	public static void main(String[] args) {
		String[] s= {"India","Nepal","Bhutan","Srilanka","Maldiv","Mayanmar"};
		Predicate<String> P = st -> st.charAt(st.length()-1)=='a';
		System.out.print("The String End With 'A' Are :");
		for(String str : s) {
			if(P.test(str)) {
				System.out.print(str+", ");
			}
		}
	}
}
