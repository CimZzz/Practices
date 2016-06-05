package designpattern.creational.summary.kit;

import designpattern.creational.summary.entity.Apartment;
import designpattern.creational.summary.entity.BigTree;
import designpattern.creational.summary.entity.City;
import designpattern.creational.summary.entity.House;
import designpattern.creational.summary.entity.River;
import designpattern.creational.summary.entity.SmallTree;
import designpattern.creational.summary.entity.Tree;
import designpattern.creational.summary.entity.Villa;

/**
 * 工厂方法
 * @author CimZzz
 *
 */
public class CityFactory extends CityKit {

	static{
		new CityFactory();
	}
	
	private CityFactory() {
		CityKit.register(getClass().getName(), this);
	}
	
	@Override
	public City createCity() {
		return new City();
	}
	
	@Override
	public Tree createTree(int Mask,int age) {
		return Mask == BIG_TREE ? new BigTree(age) : new SmallTree(age);
	}

	@Override
	public House createHouse(int Mask) {
		return Mask == APARTMENT ? new Apartment() : new Villa();
	}

	@Override
	public River createRiver() {
		return new River();
	}

}
