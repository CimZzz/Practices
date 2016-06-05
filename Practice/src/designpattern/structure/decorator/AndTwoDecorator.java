package designpattern.structure.decorator;

public class AndTwoDecorator extends Decorator{

	@Override
	public void description() {
		number.description();
	}

	@Override
	public void and(int n) {
		System.out.println("Do Decorator Func : And Two");
		number.and(n+2);
	}
	
}
