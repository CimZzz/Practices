package designpattern.structure.decorator;

/**
 * 测试：Decorator 模式的了解和使用
 * Decorator 是特殊的组合模式
 * @author CimZzz
 *
 */
public class Main {

	private static void createNumber()
	{
		Number num1 = new NormalNumber(10);
		
		num1.description();
		
		num1.and(2);
		
		num1.description();
		
		Decorator and1 = new AndOneDecorator();
		Decorator and2 = new AndTwoDecorator();
		Decorator and3 = new AndOneDecorator();
		Decorator and4 = new SubThreeDecorator();
		Decorator and5 = new AndTwoDecorator();
		
		and5.add(num1);
		
		and4.add(and5);
		and3.add(and4);
		and2.add(and3);
		and1.add(and2);
		
		
		and1.and(5);
		
		and1.description();
	}
	
	public static void main(String[] args) {
		createNumber();
	}

}
