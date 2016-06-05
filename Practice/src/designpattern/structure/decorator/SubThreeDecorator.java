package designpattern.structure.decorator;

public class SubThreeDecorator extends Decorator {

	@Override
	public void description() {
		number.description();
	}

	@Override
	public void and(int n) {
		System.out.println("Do Decorator Func : Sub Three");
		number.and(n-3);
	}

}
