package designpattern.creational.summary.kit;

import designpattern.creational.summary.entity.City;

/**
 * 总结——使用 Kit + Factory Method + Singleton 模式完成样例要求：
 * Kit 作为 Factory Method 的 Creator，Singleton 限制了 Factory 的重复创建
 * @author CimZzz
 *
 */
public class Main {
	
	private static void createCity1(CityKit kit)
	{
		City city = kit.createCity();

		city.addHouse(kit.createHouse(CityKit.VILLA));
		city.addHouse(kit.createHouse(CityKit.VILLA));
		city.addHouse(kit.createHouse(CityKit.APARTMENT));

		city.addTree(kit.createTree(CityKit.BIG_TREE, 123));
		city.addTree(kit.createTree(CityKit.SMALL_TREE, 14));
		city.addTree(kit.createTree(CityKit.SMALL_TREE, 32));
		
		System.out.println(city);
	}
	
	private static void createCity2(CityKit kit)
	{
		City city = kit.createCity();

		city.addHouse(kit.createHouse(CityKit.VILLA));
		city.addHouse(kit.createHouse(CityKit.VILLA));
		city.addHouse(kit.createHouse(CityKit.APARTMENT));
		city.addHouse(kit.createHouse(CityKit.APARTMENT));
		city.addHouse(kit.createHouse(CityKit.APARTMENT));

		city.addTree(kit.createTree(CityKit.BIG_TREE, 123));
		city.addTree(kit.createTree(CityKit.SMALL_TREE, 14));
		city.addTree(kit.createTree(CityKit.SMALL_TREE, 32));
		city.addTree(kit.createTree(CityKit.SMALL_TREE, 29));
		city.addTree(kit.createTree(CityKit.SMALL_TREE, 55));

		city.addRiver(kit.createRiver());
		
		System.out.println(city);
	}

	public static void main(String[] args) {
		createCity1(CityKit.instance());
		createCity2(CityKit.instance());
	}

}
