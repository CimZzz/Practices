package designpattern.structure.adapter;

public abstract class AbstractTarget {
	public abstract String getAdapterString();
	
	public void display()
	{
		System.out.println("Abstract Target : "+getAdapterString());
	}
}