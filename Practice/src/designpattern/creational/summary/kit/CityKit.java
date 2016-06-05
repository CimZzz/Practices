package designpattern.creational.summary.kit;

import java.util.Hashtable;

import designpattern.creational.summary.entity.City;
import designpattern.creational.summary.entity.House;
import designpattern.creational.summary.entity.River;
import designpattern.creational.summary.entity.Tree;

/**
 * 因为Kit只支持同类型产品中的一种，所以通过Mask来判断添加的产品为何种类型
 * 这里使用Singleton设计模式，选择CityFactory为实例
 * @author CimZzz
 *
 */
public abstract class CityKit {
	private static String singletonName = CityFactory.class.getName();
	
	private static Hashtable<String,CityKit> hashtable = new Hashtable<>();
	
	private static CityKit cityKit = null;
	
	static int BIG_TREE = 0;
	static int SMALL_TREE = 1;
	
	static int APARTMENT = 0;
	static int VILLA = 1;
	
	protected static void register(String singletonName,CityKit cityKit) {
		hashtable.put(singletonName, cityKit);
	}
	
	public abstract City createCity();
	
	public abstract Tree createTree(int Mask,int age);
	
	public abstract House createHouse(int Mask);
	
	public abstract River createRiver();
	
	public static CityKit instance()
	{
		synchronized (hashtable) {
			if(cityKit == null)
			{
				try {
					Class.forName(singletonName);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				cityKit = hashtable.get(singletonName);
			}
		}
		
		return cityKit;
	}
}
