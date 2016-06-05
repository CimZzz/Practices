package designpattern.creational.builder;


/**
 * 构建简单产品的生成器，生产简单产品
 * @author CimZzz
 *
 */
public class SimpleBuilder implements Builder{
	private SimpleProduct product;
	
	public SimpleBuilder()
	{
		product = new SimpleProduct();
	}
	
	@Override
	public void createPartA() {
		PartA partA = new PartA();
		partA.descrition = "由SimpleBuilder创造的PartA";
		
		product.partA = partA;
	}
	
	public SimpleProduct getProduct()
	{
		return product;
	}
}
