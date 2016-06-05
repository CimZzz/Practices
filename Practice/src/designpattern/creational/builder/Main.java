package designpattern.creational.builder;

/**
 * 测试：生成器的使用与理解
 * @author CimZzz
 *
 */
public class Main {
	
	private static void createProduct(Builder builder)
	{
		builder.createPartA();
		builder.createPartB();
		builder.createPartC();
	}

	public static void main(String[] args) {
		SimpleBuilder builder1 = new SimpleBuilder();
		CommonBuilder builder2 = new CommonBuilder();
		ComplexBuilder builder3 = new ComplexBuilder();

		createProduct(builder1);
		createProduct(builder2);
		createProduct(builder3);

		System.out.println(builder1.getProduct().description());
		System.out.println(builder2.getProduct().description());
		System.out.println(builder3.getProduct().description());
	}

}
