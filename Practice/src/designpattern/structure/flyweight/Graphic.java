package designpattern.structure.flyweight;

import java.util.Iterator;

public interface Graphic {
	void draw(DrawManager manager);
	
	void add(Graphic graphic);
	void remove(Graphic graphic);
	Graphic getChild(int n);
	Iterator<Graphic> createIterator();
}
