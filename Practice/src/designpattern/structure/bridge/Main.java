package designpattern.structure.bridge;

/**
 * 测试：Bridge模式的了解与使用
 * 1.Desk类和Material共同构建了一个桥，在系统开始时就已经决定好Material具体要采用哪个子类，
 * 具体实现方式：Abstract Factory + Singleton 实现Material的创建
 * 2.采用 Factory Method 模式完成了Desk类的构建（向参数传递不同的工厂参数生产出同一类型的产品）
 * @author CimZzz
 *
 */
public class Main {
	
	private static void createDesk1(DeskFactory factory)
	{
		MaterialKit.selectMaterialKit(RosewoodFactory.class);
		factory.createDesk().display();
	}
	
	private static void createDesk2(DeskFactory factory)
	{
		MaterialKit.selectMaterialKit(AgilawoodFactory.class);
		factory.createDesk().display();
	}

	public static void main(String[] args) {
		createDesk2(new TableFactory());
		createDesk2(new LongDeskFactory());
		
		createDesk1(new TableFactory());
		createDesk1(new LongDeskFactory());
	}

}
