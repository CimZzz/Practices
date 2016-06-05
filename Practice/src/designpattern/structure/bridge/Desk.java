package designpattern.structure.bridge;

public abstract class Desk {

	public Material getMaterial() {
		return MaterialKit.instance().createMaterial();
	}
	
	public abstract void display();
	
}
