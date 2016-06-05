package designpattern.creational.prototype;

/**
 * 原型管理器，构造方法为注册原型
 * @author CimZzz
 *
 */
public class ProtoTypeManager {
	private Fruit fruit;
	private Vegetable vegetable;
	private Dinner dinner;
	
	public ProtoTypeManager(Dinner dinner,Vegetable vegetable,Fruit fruit)
	{
		this.dinner = dinner;
		this.fruit = fruit;
		this.vegetable = vegetable;
	}
	
	Fruit makeFruit()
	{
		return fruit.Clone();
	}
	
	Vegetable makeVegetable()
	{
		return vegetable.Clone();
	}
	
	Dinner makeDinner()
	{
		return dinner.Clone();
	}
}
