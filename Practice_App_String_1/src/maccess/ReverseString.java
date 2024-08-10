package maccess;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String :");
		String str = sc.nextLine(); 	//hello this is java program
		
		String[] words=str.split(" ");
		for(String word : words) {
			String revWord="";
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			revWord=revWord+sb+" ";
			System.out.print(revWord+" ");
		}
		
	}
}
