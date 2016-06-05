package designpattern.behavioral.chainofresponsibility;

public class Button extends Handler{

	public Button(Handler handler, int handle) {
		super(handler, handle);
	}
	
	@Override
	public void click() {
		if(isHandle())
		{
			System.out.println("Button Click");
		}
		else
		{
			System.out.println("Button Don't Click");
			handler.click();
		}
	}

}
