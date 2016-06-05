package thread;

/**
 * 测试静态方法会不会将调用的对象锁住
 * 结论：会锁住0 0,但静态方法不会锁住,因为静态方法不属于对象,如果都是静态方法的话则会锁住主线程
 * @author CimZzz
 */
public class SynchronizedMethod {
	
	public static synchronized void fun1()
	{
		System.out.println("运行fun1同步方法");
		try {
			Thread.currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static synchronized void fun2(){
		System.out.println("运行fun2同步方法");
		try {
			Thread.currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SynchronizedMethod method=new SynchronizedMethod();

		new Thread(new Run1(method)).start();
		new Thread(new Run2(method)).start();
	}

}


class Run1 implements Runnable{
	private SynchronizedMethod method;
	
	public Run1(SynchronizedMethod method)
	{
		this.method=method;
	}
	
	public void run()
	{
		method.fun1();
	}
}


class Run2 implements Runnable{
	private SynchronizedMethod method;
	
	public Run2(SynchronizedMethod method)
	{
		this.method=method;
	}
	
	public void run()
	{
		method.fun2();
	}
}