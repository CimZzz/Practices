package designpattern.structure.flyweight;

import java.util.Collection;
import java.util.Hashtable;

public class ColorManager {
	public static final int COLOR_BLACK = 0;
	public static final int COLOR_RED = 1;
	
	private Hashtable<Integer, Color> colorTables;
	private Color color;
	
	public ColorManager()
	{
		colorTables = new Hashtable<>();
	}
	
	public void setColor(int count,int color)
	{
		colorTables.put(count,findColor(color));
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void nextColor(int n)
	{
		Color color = colorTables.get(n);
		
		this.color = 
				color != null ?
						color
						: this.color != null ?
								this.color
								: findColor(COLOR_BLACK);
	}
	
	private Color findColor(int colorNum)
	{
		Collection<Color> colors = colorTables.values();
		
		for(Color locColor : colors)
		{
			if(locColor.equals(colorNum))
				return locColor;
		}
		
		Color color = null;
		
		switch (colorNum) {
		case COLOR_RED:
			color = new ColorRed();
			break;

		default:
			color = new ColorBlack();
			break;
		}
		
		return color;
	}
}
