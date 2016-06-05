package interfaces;

/**
 * 测试接口继承的相关事项
 * 结果:
 * @author CimZzz
 *
 */
public class SubInteface {
	public static interface BaseInterface{
		public default void func1()
		{
			System.out.println("baseinterface__func1");
		}

		default void func2()
		{
			System.out.println("baseinterface__func2");
		}
	}
	public static interface Interface1 extends BaseInterface{
		default void func1()
		{
			System.out.println("interface1__func1");
		}

		default void func2(int i)
		{
			System.out.println("interface1__func2");
		}
	}
	public static interface Interface2 extends BaseInterface,Interface1{
	}
	
	public static void main(String[] args)
	{
		BaseInterface base=new BaseInterface() {
		};
		
		Interface1 interface1=new Interface1() {
		};
		
		BaseInterface base2 = new Interface1(){
		};
		
		Interface2 interface2=new Interface2() {
		};

		base.func1();
		base.func2();

		interface1.func1();
		interface1.func2();
		interface1.func2(1);

		interface2.func1();
		interface2.func2();
		
		base2.func1();
		base2.func2();
	}
}
