package interfaces;

/**
 * 测试接口是否具有类的三要素
 * 结果:接口不具有构造函数,其属性均为静态常量
 * @author CimZzz
 *
 */
public class BaseInterface {
	public static void main(String[] args)
	{
		System.out.println(Base_Interface.m_Number);
		Base_Interface base_Interface=new Base_Interface() {
		};

		base_Interface.test();
	}
}

interface Base_Interface{
	public int m_Number=1;
	
	public default void test(){
		System.out.println("test");
	}
}
