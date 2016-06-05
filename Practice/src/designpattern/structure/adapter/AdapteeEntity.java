package designpattern.structure.adapter;

/**
 * Adaptee实体
 * @author CimZzz
 *
 */
public class AdapteeEntity {
	private AdapteeDelegate delegate;
	
	public void delegate(AdapteeDelegate delegate) {
		this.delegate = delegate;
	}
	
	public String description()
	{
		return "AdapteeEntity";
	}
	
	public void display()
	{
		System.out.println("Adaptee Entity : "+delegate.getTargetString());
	}
}
