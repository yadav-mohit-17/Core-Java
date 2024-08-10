package test;

import java.util.function.*;
import java.util.Scanner;

class User{
	String username;
	String password;
	
	User(String username, String password){
		this.username=username;
		this.password=password;
	}
}


public class Predicate_UserPassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName :");
		String username=sc.next();
		System.out.println("Enter Password :");
		String password =sc.next();
		
		User user1=new User(username,password);
		Predicate<User> P =user-> user.username.equals("Mohit") && user.password.equals("Mohit@123");
		if(P.test(user1)) {
			System.out.println("You Are Valid User And You Can Access All The Services...");
		}
		else {
			System.err.println("Invalid Creadentials... Please Try Again");
		}
	}
}
