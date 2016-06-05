package designpattern.structure.flyweight;

public class ColorBlack implements Color {
	@Override
	public boolean equals(Object obj) {
		return (int)obj== ColorManager.COLOR_BLACK;
	}
}
