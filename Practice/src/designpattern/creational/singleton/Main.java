/**
 * 
 */
package designpattern.creational.singleton;

/**
 * 测试：单例模式的了解与使用
 * 当单例基类注册完毕后，每次调用的单例均为注册的单例
 * @author CimZzz
 *
 */
public class Main {
	
	public static void main(String[] args) {
		BaseRegisterSingleton.environmentVariable = BaseRegisterSingleton.class;
		System.out.println(BaseRegisterSingleton.instance().description());
		System.out.println(BaseRegisterSingleton.instance().description());
	}

}
