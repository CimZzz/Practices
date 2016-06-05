package thread;

/**
 * 测试：同步方法能否锁住对象
 * 结果：同步只会锁住方法，并不影响对象
 * @author CimZzz
 *
 */
public class SynchromizedClassMethod {

	public static void main(String[] args) {
		TestClass cls = new TestClass();
		
		new Thread(()->{
			while (true) {
				cls.fun2();
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(()->{
			while (true) {
				cls.fun2();
			}
		}).start();
	}
	
	
	private static class TestClass{
		public void fun1()
		{
			System.out.println("fun1 run()");
		}
		
		
		public synchronized void fun2()
		{
			System.out.println("fun2 run()");
			

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
