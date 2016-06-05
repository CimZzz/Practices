package designpattern.creational.virtualconstructor;


/**
 * 具体的工厂方法类，提供一个工厂方法并且具有了缺省的实现
 * @author CimZzz
 *
 */
public class ProductFactoryA {
	
	public Product createProduct()
	{
		return new ProductA();
	}
}

class ProductSubFactoryAA extends ProductFactoryA{
	@Override
	public Product createProduct() {
		return new ProductA();
	}
}

class ProductSubFactoryAB extends ProductFactoryA{
	@Override
	public Product createProduct() {
		return new ProductB();
	}
}
