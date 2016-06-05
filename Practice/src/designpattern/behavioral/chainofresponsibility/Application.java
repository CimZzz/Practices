package designpattern.behavioral.chainofresponsibility;

public class Application extends Handler{

	public Application() {
	}
	
	@Override
	public void click() {
		System.out.println("Don't Click");
	}

}
