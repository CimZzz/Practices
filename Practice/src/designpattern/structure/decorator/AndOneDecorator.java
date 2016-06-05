package designpattern.structure.decorator;

public class AndOneDecorator extends Decorator{

	@Override
	public void description() {
		number.description();
	}

	@Override
	public void and(int n) {
		System.out.println("Do Decorator Func : And One");
		number.and(n+1);
	}
	
}
