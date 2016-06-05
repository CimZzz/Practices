package designpattern.creational.summary.builder;

/**
 * 总结——使用 Builder 模式完成样例要求：
 * Builder 封装了建造器的全部操作并缺省实现，由子类选择想要执行的操作进行 override
 * @author CimZzz
 *
 */
public class Main {
	
	private static void createCity1(Builder builder)
	{
		builder.buildCity();

		builder.buildTree(Builder.BIG_TREE, 123);
		builder.buildTree(Builder.SMALL_TREE, 14);
		builder.buildTree(Builder.SMALL_TREE, 32);

		builder.buildHouse(Builder.VILLA);
		builder.buildHouse(Builder.VILLA);
		builder.buildHouse(Builder.APARTMENT);
		
		System.out.println(builder.getCity());
	}
	
	private static void createCity2(Builder builder)
	{
		builder.buildCity();

		builder.buildTree(Builder.BIG_TREE, 123);
		builder.buildTree(Builder.SMALL_TREE, 14);
		builder.buildTree(Builder.SMALL_TREE, 32);
		builder.buildTree(Builder.SMALL_TREE, 29);
		builder.buildTree(Builder.SMALL_TREE, 55);

		builder.buildHouse(Builder.VILLA);
		builder.buildHouse(Builder.VILLA);
		builder.buildHouse(Builder.APARTMENT);
		builder.buildHouse(Builder.APARTMENT);
		builder.buildHouse(Builder.APARTMENT);
		
		builder.buildRiver();
		
		System.out.println(builder.getCity());
	}
	
	public static void main(String[] args) {
		createCity1(new CityBuilder());
		createCity2(new CityBuilder());
	}

}
