package designpattern.creational.singleton;

import java.util.Hashtable;

/**
 * 拥有单例注册表的单例基类
 * 第一次调用Instance时会根据单例的环境变量来选择合适的单例类进行注册
 * @author CimZzz
 *
 */
public class BaseRegisterSingleton {
	private static Hashtable<Class<? extends BaseRegisterSingleton>, BaseRegisterSingleton> hashtable = new Hashtable<>();
	
	private static BaseRegisterSingleton baseSingleton;
	
	public static Class<? extends BaseRegisterSingleton> environmentVariable;
	
	static{
		new BaseRegisterSingleton();
	}
	
	public BaseRegisterSingleton()
	{
		register(getClass(), this);
	}
	
	protected static void register(Class<? extends BaseRegisterSingleton> cls,BaseRegisterSingleton baseSingleton) {
		hashtable.put(cls, baseSingleton);
	}
	
	public static BaseRegisterSingleton instance()
	{
		synchronized (environmentVariable) {
			if (baseSingleton == null)
			{
				try {
					Class.forName(environmentVariable.getName());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				baseSingleton = hashtable.get(environmentVariable);
			}
			
			return baseSingleton;
		}
	}
	
	public String description()
	{
		return "BaseRegisterSingleton";
	}
}
