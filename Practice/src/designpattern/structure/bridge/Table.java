package designpattern.structure.bridge;

public class Table extends Desk{

	@Override
	public void display() {
		System.out.println(getMaterial().description()+"'s Table");
	}

}
