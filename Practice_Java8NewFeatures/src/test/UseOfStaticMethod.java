package test;
interface Inter{
	public static void m1() {
		System.out.println("This is Interface Static method");
	}
}

public class UseOfStaticMethod implements Inter{
	public static void main(String[] args) {
		Inter.m1();
	}

}
