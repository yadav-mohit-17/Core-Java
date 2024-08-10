package test;

interface I{
	public void m1();
	public void m2();
	default void m3() {
		System.out.println("This is default method");
	}
}

class A implements I{
	public void m1() {
		System.out.println("Class A m1() method");
	}
	public void m2() {
		System.out.println("Class B m2() method");
	}
	public void m3() {
		System.out.println("This is Overrided method of default m3() method in Class A");
	}
}

class B implements I{
	public void m1(){
		System.out.println("Class c m1() method");
	}
    public void m2() {
		System.out.println("Class c m2() method");
	}
    public void m3() {
		System.out.println("This is Overrided method of default m3() method in Class B");
	}
}

class C implements I{
	public void m1() {
		System.out.println("Class c m1() method");
	}
	public void m2() {
		System.out.println("Class B m2() method");
	}
	public void m3() {
		System.out.println("This is Overrided method of default m3() method in Class C");
	}
}

public class UseOfDefaultMethods {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		
		C c= new C();
		c.m1();
		c.m2();
		c.m3();
	}
}
