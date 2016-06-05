package statement;

/**
 * Java8的lambda表达式测试
 * 结论：匿名类实现的另外一种方式
 * @author CimZzz
 *
 */
public class JAVA8_Lambda  {

	interface interface1 {
		int fun();
	}

	interface interface2 {
		int fun();
	}

	interface interface3 {
		int fun();
	}
	
	static class LambdaTestClass{
		public LambdaTestClass(interface1 i1,interface1 i2,interface1 i3)
		{
			System.out.println(i1.fun()+i3.fun()+i2.fun());
		}
	}
	
	public static void main(String[] args) {
		Thread gaoDuanDaQiShangDangCi = new Thread( () -> {
	        System.out.println("This is from an anonymous method (lambda exp).");
	    } );
		gaoDuanDaQiShangDangCi.start();
		
		new LambdaTestClass(()->{return 5;},()->{return 6;},()->{return 7;});
	}

}
