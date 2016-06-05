package designpattern.structure.flyweight;

import java.util.Hashtable;

public class TextFactory {
	private Hashtable<Character, Text> flyweightPool;
	
	public TextFactory()
	{
		flyweightPool = new Hashtable<>();
	}
	
	public Text getText(char flag)
	{
		Text text = flyweightPool.get(flag);
		
		if(text == null)
		{
			text = new Text(flag);
			
			flyweightPool.put(flag, text);
		}
		
		return text;
	}
	
	public int length()
	{
		return flyweightPool.size();
	}
}
