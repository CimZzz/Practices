package designpattern.structure.flyweight;

public class DrawManager {
	private ColorManager colorManager;
	
	private int index;
	
	public DrawManager()
	{
		colorManager = new ColorManager();
		
		index = 0;
	}
	
	public void setDrawInfo(int index,int color)
	{
		colorManager.setColor(index, color);
	}
	
	public void initPosition()
	{
		index = 0;
	}
	
	public void next()
	{
		colorManager.nextColor(index++);
	}
	
	public void setColor(int index,int color)
	{
		colorManager.setColor(index, color);
	}
	
	public Color getColor()
	{
		return colorManager.getColor();
	}
}