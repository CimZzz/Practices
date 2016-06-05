package designpattern.structure.bridge;

public class AgilawoodFactory extends MaterialKit {

	static{
		new AgilawoodFactory();
	}
	
	public AgilawoodFactory() {
		MaterialKit.register(this);
	}
	
	@Override
	public Material createMaterial() {
		return new Agilawood();
	}

}
