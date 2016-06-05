package designpattern.structure.flyweight;

public class ColorRed implements Color{
	@Override
	public boolean equals(Object obj) {
		return (int)obj== ColorManager.COLOR_RED;
	}
}
