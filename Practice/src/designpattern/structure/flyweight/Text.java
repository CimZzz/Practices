package designpattern.structure.flyweight;

public class Text extends GraphicImpl {
	private char c;
	
	Text(char c) {
		this.c = c;
	}

	@Override
	public void draw(DrawManager manager) {
		if(manager.getColor() instanceof ColorRed)
		{
			System.out.print(c+"!");
		}
		else if(manager.getColor() instanceof ColorBlack)
		{
			System.out.print(c+"?");
		}
	}

}
