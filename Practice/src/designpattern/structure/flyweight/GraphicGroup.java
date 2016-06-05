package designpattern.structure.flyweight;

import java.util.Iterator;
import java.util.Vector;

public abstract class GraphicGroup extends GraphicImpl {
	private Vector<Graphic> graphics;
	
	protected GraphicGroup() {
		graphics = new Vector<>();
	}
	
	@Override
	public void add(Graphic graphic) {
		graphics.add(graphic);
	}
	
	@Override
	public void remove(Graphic graphic) {
		graphics.remove(graphic);
	}
	
	public Graphic getChild(int n) {
		return graphics.get(n);
	};
	
	@Override
	public Iterator<Graphic> createIterator() {
		return graphics.iterator();
	}

}
