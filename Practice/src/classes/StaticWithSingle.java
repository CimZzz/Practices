package classes;

import time.DelayedTime;

/**
 * 测试单例与类属方法的效率,貌似相等
 * @author CimZzz
 *
 */
public class StaticWithSingle {
	
	
	public static void main(String[] args) {
		DelayedTime delayedTime=new DelayedTime();
		
		delayedTime.start();
		A a=A.getSingleInstance();
		
		for(int i=0;i<100000;i++)
			a.f();
		
		System.out.println("A:"+delayedTime.end());

		delayedTime.start();
		for(int i=0;i<100000;i++)
			B.f();
		
		System.out.println("B:"+delayedTime.end());
		
		delayedTime.start();
		C c=new C();
		for(int i=0;i<100000;i++)
			c.f();
		
		System.out.println("C:"+delayedTime.end());
	
	}

}

class A{
	private static A m_A;

	public static A getSingleInstance()
	{
		if(m_A==null)m_A=new A();
		return m_A;
	}
	
	public int f()
	{
		return 1;
	}
}
class B{
	public static int f()
	{
		return 1;
	}
}

class C{
	public int f()
	{
		return 1;
	}
}
