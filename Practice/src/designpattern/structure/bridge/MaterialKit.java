package designpattern.structure.bridge;

import java.util.Hashtable;

public abstract class MaterialKit {
	private static Hashtable<String,MaterialKit> kitTable = new Hashtable<>();
	private static String kitName = "";
	
	private static MaterialKit kit;
	
	protected static void register(MaterialKit kit) {
		kitTable.put(kit.getClass().getName(), kit);
	}
	
	public static void selectMaterialKit(Class<? extends MaterialKit> cls)
	{
		synchronized (kitTable) {
			kitName = cls.getName();
		}
	}
	
	public static MaterialKit instance()
	{
		synchronized (kitTable) {
			if(kit == null)
			{
				try {
					Class.forName(kitName);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				kit = kitTable.get(kitName);
			}
		}
		
		return kit;
	}
	
	public abstract Material createMaterial();
}
