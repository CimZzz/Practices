package designpattern.creational.singleton;

/**
 * 子类单例，在构造时将自身注册至单例基类
 * @author CimZzz
 *
 */
public class SubRegisterSingleton extends BaseRegisterSingleton{
	
	static{
		new SubRegisterSingleton();
	}
	
	public SubRegisterSingleton()
	{
		BaseRegisterSingleton.register(getClass(), this);
	}
	
	public String description()
	{
		return "SubRegisterSingleton";
	}
}
