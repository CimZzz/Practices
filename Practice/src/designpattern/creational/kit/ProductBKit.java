package designpattern.creational.kit;

/**
 * 一个生产ProductB的工厂,使用单例模式
 * @author CimZzz
 *
 */
public class ProductBKit implements AbstractFactory {
	private static ProductBKit kit = new ProductBKit();
	
	public static ProductBKit getInstance() {
		return kit;
	}
	
	private ProductBKit() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
