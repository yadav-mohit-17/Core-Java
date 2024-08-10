package test;
import java.util.function.Predicate;

public class Predicate_PlayWithNumbers {
	public static void main(String[] args) {
		int[] x= {0,5,10,15,20,25,30};
		
		Predicate<Integer> P1 = a-> a>10;
		Predicate<Integer> P2 = a -> a%2==0;
		
		System.out.print("The Numbers Which is Greater Than 10 Are :");
		m1(P1,x);	
		
		System.out.print("\nThe Number Which are Even Are :");
		m1(P2,x);
		
		System.out.print("\nThe Number Which Are Greater Than 10 And Which is Even Are :");
		m1(P1.and(P2),x);
		
		System.out.print("\nThe Number Which Is Greater Than 10 Or Even Is :");
		m1(P1.or(P2),x);
		
		System.out.print("\nThe Number Which Is Less Than 10 Are :");
		m1(P1.negate(),x);
	}
	
	public static void m1(Predicate<Integer> P, int[] x) {
		for(int x1 : x) {
			if(P.test(x1)) {
				System.out.print(x1+" ");
			}
		}
	}
}
