package designpattern.structure.decorator;

public class NormalNumber extends Number{
	
	public NormalNumber(Integer i) {
		number = i;
	}

	@Override
	public void description() {
		System.out.println("Number is :"+number);
	}

	@Override
	public void and(int n) {
		number += n;
	}
}
