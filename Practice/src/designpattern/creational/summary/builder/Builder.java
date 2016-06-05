package designpattern.creational.summary.builder;

import designpattern.creational.summary.entity.City;

/**
 * 建造者模式
 * @author CimZzz
 *
 */
public abstract class Builder {
	static int BIG_TREE = 0;
	static int SMALL_TREE = 1;
	
	static int APARTMENT = 0;
	static int VILLA = 1;
	
	protected City city;
	
	public Builder()
	{
		
	}
	
	public void buildCity()
	{
		city = new City();
	}
	
	public City getCity()
	{
		return city;
	}
	
	public void buildTree(int mask,int age)
	{
		
	}
	
	public void buildHouse(int mask)
	{
		
	}
	
	public void buildRiver()
	{
		
	}
}
