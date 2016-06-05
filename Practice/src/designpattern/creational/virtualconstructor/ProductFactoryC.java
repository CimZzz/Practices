package designpattern.creational.virtualconstructor;


/**
 * 参数化工厂方法，通过不同的参数创建不同的产品
 * @author CimZzz
 *
 */
public class ProductFactoryC {
	public static final int PRODUCT_A = 0;
	public static final int PRODUCT_B = 1;
	
	public Product createProduct(int flag)
	{
		Product product=null;
		
		switch (flag) {
		case PRODUCT_A:
			product = new ProductA();
			break;
		case PRODUCT_B:
			product = new ProductB();
			break;

		default:
			break;
		}
		
		return product;
	}
}
