package designpattern.structure.decorator;

import java.util.Iterator;

public abstract class Number implements NumberInterface{
	protected Integer number;
	
	@Override
	public void add(NumberInterface num) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void remove(NumberInterface num) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public NumberInterface getChild(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	public Iterator<NumberInterface> createIterator() {
		return null;
	};
}
