package designpattern.creational.kit;

/**
 * 一个生产ProductA的工厂,使用单例模式
 * @author CimZzz
 *
 */
public class ProductAKit implements AbstractFactory {
	private static ProductAKit kit = new ProductAKit();
	
	public static ProductAKit getInstance() {
		return kit;
	}
	
	private ProductAKit() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

}
