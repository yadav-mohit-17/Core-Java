package numbers;
import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value :");
		int first = sc.nextInt();
		System.out.println("Enter Second Value :");
		int second = sc.nextInt();
		
		if(first > second) {
			System.out.println(first + " is greater than "+ second);
		}
		else {
			System.out.println(second + " is greater than "+first);
		}
		sc.close();
	}
}
