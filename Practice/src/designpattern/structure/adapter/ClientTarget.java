package designpattern.structure.adapter;

public class ClientTarget {
	private TargetDelegate delegate;
	
	public void delegate(TargetDelegate delegate) {
		this.delegate = delegate;
	}
	
	public String description()
	{
		return "ClientTarget";
	}
	
	public void display()
	{
		System.out.println("Client Target : "+delegate.getAdapteeString());
	}
}