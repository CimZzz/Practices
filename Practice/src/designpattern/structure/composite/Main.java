package designpattern.structure.composite;

import java.util.Iterator;

/**
 * 测试：Composite 模式的了解和使用
 * 这里使用了 Builder + Composite 模式来构建一个View组合，不过这里构造组合没有涉及到复杂的算法，所以
 * 不推荐使用Builder
 * 越是熟悉的模式，越是花费大量的时间
 * @author CimZzz
 *
 */
public class Main {

	private static void createViewGroup()
	{
		Builder builder = new Builder();
		
		builder.build();
		builder.addButton();
		builder.addTextView("sdsd");
		builder.addButton();
		builder.addTextView("2ee2e");
		builder.addButton();
		builder.addButton();
		
		ViewGroup viewGroup = builder.getViewGroup();
		
		viewGroup.desciption();
		
		Iterator<ViewInterface> iterator = viewGroup.createInterator();
		
		while (iterator.hasNext())
		{
			iterator.next().desciption();
		}
	}
	
	public static void main(String[] args) {
		createViewGroup();
	}

}
