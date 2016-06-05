package designpattern.structure.bridge;

public class LongDesk extends Desk{

	@Override
	public void display() {
		System.out.println(getMaterial().description()+"'s LongDesk");
	}

}
