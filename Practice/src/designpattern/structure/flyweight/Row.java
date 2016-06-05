package designpattern.structure.flyweight;

import java.util.Iterator;

public class Row extends GraphicGroup {
	
	@Override
	public void draw(DrawManager manager) {
		System.out.println("NewRow------");
		Iterator<Graphic> iterator = createIterator();
		
		while(iterator.hasNext())
		{
			manager.next();
			iterator.next().draw(manager);
		}
	}
}
