package interfaces;

/**
 * 测试具有缺省接口方法的接口
 * 结果：具有default修饰的接口方法无法使接口成为功能性接口
 * @author CimZzz
 *
 */
public class DefaultInterface{
	public static void main(String[] args)
	{
		Interface interface1=new Interface() {
		};
		Interface interface2=new Interface() {
			@Override
			public void Output() {
				System.out.println("哈哈");
			}
		};

		interface1.Output();
		interface2.Output();
	}
}

interface Interface {
	default void Output(){
		System.out.println("调用缺省的借口方法");
	}
}
