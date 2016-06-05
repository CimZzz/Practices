package gc;


class A {
	public void finalize() {
		System.out.println("method A.finalize at " + System.nanoTime());
	}
}

class B {
	public void finalize() {
		System.out.println("method B.finalize at " + System.nanoTime());
	}
}


public class Finalize {

	public static void postA(A a)
	{
		new A();
	}

	public static void main(String[] args) throws InterruptedException {
		B b = new B();
		A a = new A();
		a = null;
		b=null;
		System.gc();
		
		Thread.sleep(220);
	}

}
