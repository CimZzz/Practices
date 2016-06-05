package designpattern.behavioral.chainofresponsibility;

public abstract class Handler {
	public static final int HANDLE = 1;
	
	private int handle;
	protected Handler handler;
	
	public Handler()
	{
		
	}
	
	public Handler(Handler handler,int handle)
	{
		this.handle = handle;
		
		this.handler = handler;
	}
	
	public boolean isHandle()
	{
		return handle == HANDLE;
	}
	
	public void click()
	{
	}
}
