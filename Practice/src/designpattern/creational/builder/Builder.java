package designpattern.creational.builder;

/**
 * 生成器接口，满足了所有ConcreteBuilder的构造
 * @author CimZzz
 *
 */
public interface Builder {
	default void createPartA(){
		
	};
	
	default void createPartB()
	{
		
	}
	
	default void createPartC()
	{
		
	}
}
