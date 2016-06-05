package designpattern.creational.builder;

/**
 * 构建普通产品的生成器，生产普通产品
 * @author CimZzz
 *
 */
public class CommonBuilder implements Builder{
	private CommonProduct product;
	
	public CommonBuilder()
	{
		product = new CommonProduct();
	}
	
	@Override
	public void createPartA() {
		PartA partA = new PartA();
		partA.descrition = "由CommonBuilder创造的PartA";
		
		product.partA = partA;
	}
	
	@Override
	public void createPartB() {
		PartB partB = new PartB();
		partB.descrition = "由CommonBuilder创造的PartB";
		
		product.partB = partB;
	}
	
	public CommonProduct getProduct()
	{
		return product;
	}
}
