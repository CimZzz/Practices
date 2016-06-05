/**
 * 
 */
package designpattern.creational.prototype;

/**
 * 测试：原型模式的了解与使用
 * 每个原型实例都必须实现Cloneable用于克隆自身。
 * 以原型实例为蓝图进行产品的创建
 * @author CimZzz
 *
 */
public class Main {
	
	private static Dinner addDinner(ProtoTypeManager manager)
	{
		Dinner dinner = manager.makeDinner();
		
		dinner.addFruit(manager.makeFruit());
		
		dinner.addVegetable(manager.makeVegetable());
		
		dinner.printDinner();
		
		return dinner;
	}
	
	public static void main(String[] args) {
		Dinner dinner;
		
		ProtoTypeManager manager1 = new ProtoTypeManager(new Dinner(), new Tomato(), new Apple());
		addDinner(manager1);
		
		ProtoTypeManager manager2 = new ProtoTypeManager(new Dinner(), new Potato(), new Banana());
		dinner = addDinner(manager2);
		
		ProtoTypeManager manager3 = new ProtoTypeManager(new Dinner(), new Potato(), new Apple());
		addDinner(manager3);
		
		ProtoTypeManager manager4 = new ProtoTypeManager(new Dinner(), new Tomato(), new Banana());
		addDinner(manager4);

		ProtoTypeManager manager5 = new ProtoTypeManager(dinner, new Tomato(), new Banana());
		addDinner(manager5);
		
	}

}
