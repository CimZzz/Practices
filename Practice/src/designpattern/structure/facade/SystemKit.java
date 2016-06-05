package designpattern.structure.facade;

import java.util.Hashtable;

public abstract class SystemKit {
	private static Hashtable<Class<? extends SystemKit>, SystemKit> kitTable = new Hashtable<>();
	private static Class<? extends SystemKit> kitCls = NormalSystemKit.class;
	
	protected SystemKit()
	{
	}
	
	protected void register(SystemKit kit) {
		kitTable.put(kit.getClass(), kit);
	}

	public static SystemKit instance()
	{
		return instance(kitCls);
	}
	
	public static SystemKit instance(Class<? extends SystemKit> cls)
	{
		SystemKit systemKit = null;
		
		synchronized (kitTable) {
			try {
				Class.forName(cls.getName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			systemKit = kitTable.get(cls);
		}
		
		System.out.println("获得的工厂实例为："+systemKit.getClass().getName());
		
		return systemKit;
	}

	public abstract ReaderSystem createReaderSystem();
	public abstract WriterSystem createWriterSystem();
}
