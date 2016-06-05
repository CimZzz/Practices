package designpattern.creational.summary.prototype;

import designpattern.creational.summary.entity.Apartment;
import designpattern.creational.summary.entity.BigTree;
import designpattern.creational.summary.entity.City;
import designpattern.creational.summary.entity.River;
import designpattern.creational.summary.entity.SmallTree;
import designpattern.creational.summary.entity.Villa;

/**
 * 
 * 总结——使用 Prototype 模式完成样例要求：
 * 第一次创建的City作为第二次创建的City的原型，在其基础上添加了额外的内部组件，形成了新的产品、
 * @author CimZzz
 *
 */
public class Main {
	private static City createCity1(PrototypeManager manager1,PrototypeManager manager2)
	{
		City city = manager1.makeCity();
		
		city.addTree(manager1.makeTree(123));
		city.addTree(manager2.makeTree(14));
		city.addTree(manager2.makeTree(32));

		city.addHouse(manager1.makeHouse());
		city.addHouse(manager1.makeHouse());
		city.addHouse(manager2.makeHouse());
		
		System.out.println(city);
		
		return city;
	}

	private static void createCity2(PrototypeManager manager1,PrototypeManager manager2)
	{
		City city = manager1.makeCity();

		city.addTree(manager2.makeTree(29));
		city.addTree(manager2.makeTree(55));

		city.addHouse(manager2.makeHouse());
		city.addHouse(manager2.makeHouse());
		
		city.addRiver(manager1.makeRiver());
		
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		PrototypeManager manager1 = new PrototypeManager(new City(), new BigTree(1), new Villa(), new River());
		PrototypeManager manager2 = new PrototypeManager(null, new SmallTree(1), new Apartment(), null);

		City city = createCity1(manager1, manager2);
		
		PrototypeManager manager3 = new PrototypeManager(city, new BigTree(1), new Villa(), new River());
		
		createCity2(manager3, manager2);
	}

}
