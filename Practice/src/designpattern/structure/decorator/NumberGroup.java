package designpattern.structure.decorator;

import java.util.Iterator;
import java.util.Vector;

public class NumberGroup extends Number{
	private Vector<NumberInterface> numbers;

	public NumberGroup() {
		numbers = new Vector<>();
	}
	
	@Override
	public void description() {
		for(NumberInterface number : numbers)
		{
			number.description();
		}
	}

	@Override
	public void and(int n) {
		for(NumberInterface number : numbers)
		{
			number.and(n);
		}
	}

	@Override
	public void add(NumberInterface num) {
		numbers.add(num);
	}
	
	@Override
	public void remove(NumberInterface num) {
		// TODO Auto-generated method stub
		numbers.remove(num);
	}
	
	@Override
	public NumberInterface getChild(int n) {
		// TODO Auto-generated method stub
		return numbers.get(n);
	}
	
	@Override
	public Iterator<NumberInterface> createIterator() {
		// TODO Auto-generated method stub
		return numbers.iterator();
	}
}
