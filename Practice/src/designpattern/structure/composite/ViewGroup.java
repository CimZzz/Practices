package designpattern.structure.composite;

import java.util.Iterator;
import java.util.Vector;

public class ViewGroup extends View{
	private Vector<ViewInterface> views;
	
	public ViewGroup() {
		views = new Vector<>();
	}
	
	@Override
	public void desciption() {
		System.out.println("One ViewGrop ---------------");
		
		for(ViewInterface view : views)
		{
			view.desciption();
		}
		
		System.out.println("ViewGrop End ---------------");
	}

	@Override
	public void add(ViewInterface view) {
		views.add(view);
	}
	
	@Override
	public void remove(ViewInterface view) {
		views.remove(view);
	}
	
	@Override
	public ViewInterface getChild(int i) {
		return views.get(i);
	}
	
	public Iterator<ViewInterface> createInterator() {
		return views.iterator();
	};
	
}
