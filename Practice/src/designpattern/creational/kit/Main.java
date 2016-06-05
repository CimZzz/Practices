package designpattern.creational.kit;

/**
 * 测试：抽象工厂的使用与理解
 * @author CimZzz
 *
 */
public class Main {

	private static void createProduct(AbstractFactory factory)
	{
		Product product = factory.createProduct();
		
		System.out.println(product.description());
	}
	
	public static void main(String[] args) {
		createProduct(ProductAKit.getInstance());
		createProduct(ProductBKit.getInstance());
	}

}
