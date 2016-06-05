package designpattern.structure.bridge;

public class RosewoodFactory extends MaterialKit {

	static{
		new RosewoodFactory();
	}
	
	public RosewoodFactory() {
		MaterialKit.register(this);
	}
	
	@Override
	public Material createMaterial() {
		return new Rosewood();
	}

}
