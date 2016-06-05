package designpattern.structure.decorator;

import java.util.Iterator;

public interface NumberInterface { 
	void description();
	void and(int n);
	
	void add(NumberInterface num);
	void remove(NumberInterface num);
	NumberInterface getChild(int n);
	Iterator<NumberInterface> createIterator();
}
