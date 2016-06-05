package designpattern.creational.virtualconstructor;


/**
 * 抽象的工厂方法类，需要子类实现其工厂方法(可以看做接口)
 * @author CimZzz
 *
 */
public abstract class ProductFactoryB {
	public abstract Product createProduct();
}

class ProductSubFactoryBA extends ProductFactoryB{

	@Override
	public Product createProduct() {
		return new ProductA();
	}
}

class ProductSubFactoryBB extends ProductFactoryB{

	@Override
	public Product createProduct() {
		return new ProductB();
	}
}