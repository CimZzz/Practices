package designpattern.creational.summary.prototype;

import designpattern.creational.summary.entity.City;
import designpattern.creational.summary.entity.House;
import designpattern.creational.summary.entity.River;
import designpattern.creational.summary.entity.Tree;

/**
 * 原型管理器
 * @author CimZzz
 *
 */
public class PrototypeManager {
	private City city;
	private Tree tree;
	private House house;
	private River river;
	
	public PrototypeManager(City city,Tree tree,House house,River river)
	{
		this.city = city;
		this.house = house;
		this.river = river;
		this.tree = tree;
	}
	
	public City makeCity()
	{
		return city.Clone();
	}
	
	public Tree makeTree(int age)
	{
		Tree tree = this.tree.Clone();
		tree.setAge(age);
		
		return tree;
	}
	
	public House makeHouse()
	{
		return house.Clone();
	}
	
	public River makeRiver()
	{
		return river.Clone();
	}
}
