package designpattern.structure.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试：Flyweight 的了解与使用
 * 该测试的享元为Text，通过TextFactory来生产并且进行享元处理，享元的基类是Graphic
 * 结合了 Composite + Factory Method + Flyweight + Facade 模式。
 * Facade层为 DrawManager ，包含了子系统 ColorManager ，这样设计提升了可扩展性，一切的外部状态
 * 处理全部放在Facade中计算，而控件每次绘画自身时都要传递 DrawManager 作为参数
 * @author CimZzz
 *
 */
public class Client {

	public static void main(String[] args) {
		
		TextFactory textFactory = new TextFactory();
		DrawManager manager = new DrawManager();
		List<Row> rows = new ArrayList<>();
		Row row = new Row();
		row.add(textFactory.getText('A'));//0
		row.add(textFactory.getText('B'));//1
		row.add(textFactory.getText('C'));//2
		row.add(textFactory.getText('D'));//3
		row.add(textFactory.getText('E'));//4
		row.add(textFactory.getText('F'));//5
		
		rows.add(row);
		
		row = new Row();
		row.add(textFactory.getText('B'));//6
		row.add(textFactory.getText('C'));//7
		row.add(textFactory.getText('D'));//8
		row.add(textFactory.getText('E'));//9
		
		rows.add(row);

		manager.setColor(1,ColorManager.COLOR_RED);
		manager.setColor(2,ColorManager.COLOR_BLACK);
		manager.setColor(3,ColorManager.COLOR_RED);
		manager.setColor(4,ColorManager.COLOR_BLACK);
		manager.setColor(5,ColorManager.COLOR_RED);
		manager.setColor(6,ColorManager.COLOR_BLACK);
		manager.setColor(7,ColorManager.COLOR_RED);
		manager.setColor(8,ColorManager.COLOR_BLACK);
		manager.setColor(9,ColorManager.COLOR_RED);
		
		manager.initPosition();
		
		for(Row row1 : rows)
		{
			row1.draw(manager);
			System.out.println("\n");
		}
		
		System.err.println(textFactory.length());
	}

}
