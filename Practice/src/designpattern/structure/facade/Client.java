package designpattern.structure.facade;

/**
 * 测试：Facade 模式的使用和了解
 * 采用 Facade 层包装两个子系统：WriterSystem 和 ReaderSystem，调用 Facade 的方法实现子系统的功能
 * 其中两个子系统产生的具体系统均是由Kit决定，Kit 和 Facade 均实现为 Singleton 
 * @author CimZzz
 *
 */
public class Client {

	public static void main(String[] args) {
		ConsoleSystem.instance().openInputReader(SystemKit.instance());
		ConsoleSystem.instance().openOutputWriter(SystemKit.instance());

		ConsoleSystem.instance().openInputReader(SystemKit.instance(CommonSystemKit.class));
		ConsoleSystem.instance().openOutputWriter(SystemKit.instance(CommonSystemKit.class));
		
		System.out.print("s");
		
	}

}
