package time;

import time.Base1.Base2.Base3;

/**
 * 测试直接调用函数与引用调用函数的速度
 * 结果：引用调用会优于直接调用
 * @author CimZzz
 *
 */
public class Method_ReferenceMethod {
	
	public static void main(String[] args) {
		DelayedTime delayedTime=new DelayedTime();

		delayedTime.start();
		
		for(int i=0;i<1000000;i++)
		{
			Base1.base2.base3.fun();
		}
		
		System.out.println(delayedTime.end());
		
		delayedTime.start();
		
		Base3 base3=Base1.base2.base3;
		
		for(int i=0;i<1000000;i++)
		{
			base3.fun();
		}
		
		System.out.println(delayedTime.end());
	}

}


class Base1{
	public static Base2 base2=new Base2();
	static class Base2{
		public Base3 base3=new Base3();
		class Base3{
			void fun()
			{
				for(int i=0;i<20;i++);
			}
		}
	}
}