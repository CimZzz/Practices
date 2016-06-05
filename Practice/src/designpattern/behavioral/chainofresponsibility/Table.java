package designpattern.behavioral.chainofresponsibility;

public class Table extends Handler{

	public Table(Handler handler, int handle) {
		super(handler, handle);
	}
	
	@Override
	public void click() {
		if(isHandle())
		{
			System.out.println("Table Click");
		}
		else
		{
			System.out.println("Table Don't Click");
			
			handler.click();
		}
	}

}
