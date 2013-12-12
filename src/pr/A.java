package pr;

public class A {
	public static void main(String[] args) {
		C c = new B();
		c.print();
	}
}

class B extends C {
	int n = 1;

	void print() {
		System.out.println(n);
	}

	
}

class C {
	int n = 3;

	void print() {
		System.out.println(n);
	}
}
