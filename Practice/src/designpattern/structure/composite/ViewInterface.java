package designpattern.structure.composite;

import java.util.Iterator;

public interface ViewInterface {
	void desciption();

	void add(ViewInterface view);
	void remove(ViewInterface view);
	ViewInterface getChild(int i);
	Iterator<ViewInterface> createInterator();
}
