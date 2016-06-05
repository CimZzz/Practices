package designpattern.structure.composite;

import java.util.Iterator;

public abstract class View implements ViewInterface{

	public abstract void desciption();

	@Override
	public void add(ViewInterface view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(ViewInterface view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ViewInterface getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<ViewInterface> createInterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
