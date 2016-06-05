package jni;

import file.GetFile;
import time.DelayedTime;

/**
 * JNI与Java的速度测试
 * @author CimZzz
 *
 */
public class TimeTest {
	
	static{
		System.load(GetFile.getFilePath("dllFolder/jni_TimeTest.dll"));
	}

	private static void timeConsumingOperation()
	{
		int sum;
		for(int i=0;i<10000;i++){
			sum=0;
			for(int j=0;j<10000;j++){
				sum=0;
				for(int k=0;k<10000;k++){
					sum=0;
				}
			}
		}
	}
	
	private static native void timeConsumingOperation_jni();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DelayedTime delayedTime=new DelayedTime();
		delayedTime.start();
		
		timeConsumingOperation();
		
		
		System.out.println("Local Completed Time:"+delayedTime.end());
		
		delayedTime.start();
		
		timeConsumingOperation_jni();
		
		
		System.out.println("JNI Completed Time:"+delayedTime.end());
	}

}
