package string;

import time.DelayedTime;

/**
 * 测试String与StringBuilder对于追加字符串的性能
 * String的性能严重小于StringBuilder,因为String对象不可修改,所以每次追加字符串都会返回一个新的String对象
 * @author CimZzz
 *
 */
public class String_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="";
		StringBuilder sb=new StringBuilder();
		DelayedTime delayedTime=new DelayedTime();
		delayedTime.start();

		for(long i=0;i<10000L;i++)
			str+=i;
		
		System.out.println(delayedTime.end());
		
		delayedTime.start();

		for(long i=0;i<10000L;i++)
			sb.append(i);
		
		System.out.println(delayedTime.end());
		
		delayedTime.start();

		for(long i=0;i<100000L;i++)
		{
			sb.append(i);
			sb.append("haha");
		}
		
		System.out.println(delayedTime.end());
		
		delayedTime.start();

		for(long i=0;i<100000L;i++)
			sb.append(i+"haha");
		
		System.out.println(delayedTime.end());
		
		
	}

}
