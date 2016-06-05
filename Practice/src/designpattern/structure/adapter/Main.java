package designpattern.structure.adapter;

/**
 * Adapter Design Pattern
 * 测试：适配器设计模式的了解与使用
 * 分为三种模式：
 * 1.通过子类扩展抽象操作来实现适配器（即如果有不同的Adaptee就要创建不同的子类）
 * 2.通过将适配方法以委托的方式传送，通过委托对象实现适配器（这样如果有不同的Adaptee的话，只需要创建不同的适配对象，而无需修改自身）
 * 3.Java无法多重继承，所以只能使用对象组合的方式或者单继承+单组合的方式实现对于适配器两端的适配
 * 4.对于Android 的 ListView，采用的适配器模式是第二种模式，其中Adaptee是Adapter中的数据，Target是ListView
 * @author CimZzz
 *
 */
public class Main {

	public static void main(String[] args) {
		AbstractTarget target = new AbstractAdapter(new AdapteeEntity());
		target.display();
		
		ClientTarget target2 = new ClientTarget();
		
		DelegateAdapter adapter = new DelegateAdapter();
		adapter.setEntity(new AdapteeEntity());
		
		target2.delegate(adapter);
		target2.display();
		
		AdapteeEntity entity = new AdapteeEntity();
		BidirectionalAdapter adapter2 = new BidirectionalAdapter(entity, target2);
		
		entity.delegate(adapter2);
		target2.delegate(adapter2);
		
		entity.display();
		target2.display();
	}

}
