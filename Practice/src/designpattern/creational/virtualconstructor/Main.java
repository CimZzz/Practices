package designpattern.creational.virtualconstructor;

/**
 * 测试：工厂方法的使用与理解
 * 工厂的命名方法要一致，让人能一眼看出是工厂方法
 * @author CimZzz
 *
 */
public class Main {
	
	private static void printProduct(Product product)
	{
		System.out.println(product.description());
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		ProductFactoryA factoryA = new ProductFactoryA();
		printProduct(factoryA.createProduct());
		factoryA = new ProductSubFactoryAA();
		printProduct(factoryA.createProduct());
		factoryA = new ProductSubFactoryAB();
		printProduct(factoryA.createProduct());
		
		
		ProductFactoryB factoryB;
		factoryB = new ProductSubFactoryBA();
		printProduct(factoryB.createProduct());
		factoryB = new ProductSubFactoryBB();
		printProduct(factoryB.createProduct());
		
		ProductFactoryC factoryC = new ProductFactoryC();
		printProduct(factoryC.createProduct(ProductFactoryC.PRODUCT_A));
		printProduct(factoryC.createProduct(ProductFactoryC.PRODUCT_B));
		
		ProductFactoryD factoryD = new ProductFactoryD();
		printProduct(factoryD.createProduct(ProductA.class));
		printProduct(factoryD.createProduct(ProductB.class));
	}

}
