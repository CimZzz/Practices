package designpattern.creational.builder;

/**
 * 构建复杂产品的生成器，生产复杂产品
 * @author CimZzz
 *
 */
public class ComplexBuilder implements Builder{
	private ComplexProduct product;
	
	public ComplexBuilder()
	{
		product = new ComplexProduct();
	}
	
	@Override
	public void createPartA() {
		PartA partA = new PartA();
		partA.descrition = "由ComplexBuilder创造的PartA";
		
		product.partA = partA;
	}
	
	@Override
	public void createPartB() {
		PartB partB = new PartB();
		partB.descrition = "由ComplexBuilder创造的PartB";
		
		product.partB = partB;
	}
	
	@Override
	public void createPartC() {
		PartC partC = new PartC();
		partC.descrition = "由ComplexCuilder创造的PartC";
		
		product.partC = partC;
	}
	
	
	public ComplexProduct getProduct()
	{
		return product;
	}
}
