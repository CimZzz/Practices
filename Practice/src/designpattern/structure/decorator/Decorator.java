package designpattern.structure.decorator;

import java.util.Iterator;

public abstract class Decorator implements DecoratorInterface {
	protected NumberInterface number;

	@Override
	public void add(NumberInterface num) {
		number = num;
	}

	@Override
	public void remove(NumberInterface num) {
		number = null;
	}

	@Override
	public NumberInterface getChild(int n) {
		return number;
	}

	@Override
	public Iterator<NumberInterface> createIterator() {
		return null;
	}

}
