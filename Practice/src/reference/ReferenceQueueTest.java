package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 测试四种引用的生命周期
 * 1.SoftReference——JVM不爆炸的情况下不会清楚
 * 2.WeakReference——每次GC都会被清除
 * 3.PhantomReference——任何时候都是null
 * @author CimZzz
 *
 */
public class ReferenceQueueTest {

	static int id=0;

	public static void main(String[] args) throws InterruptedException {
//		ReferenceQueue<A> queue=new ReferenceQueue<>();
		
//		SoftReference<A> softReference=new SoftReference<A>(new A(),queue);
//		
//		System.gc();
//		
//		System.out.println(softReference.get());
//		
//
//		WeakReference<A> weakReference=new WeakReference<A>(new A(),queue);
//		
//		System.gc();
//		
//		System.out.println(weakReference.get());
//		
//		
//		Thread.sleep(1000);
//		
//		PhantomReference<A> phantomReference=new PhantomReference<A>(new A(),queue);
//		
//		System.out.println(phantomReference.get());
//		
//		System.gc();
//		
//		System.out.println(phantomReference.get());
//		
//		
//		Thread.sleep(1000)
		

		ReferenceQueue<A> queue=new ReferenceQueue<>();

		A a1=new A();
		A a2=new A();
		A a3=new A();
		A a4=new A();
		A a5=new A();
		SoftReference<A> softReference1=new SoftReference<A>(a1,queue);
		SoftReference<A> softReference2=new SoftReference<A>(a2,queue);
		SoftReference<A> softReference3=new SoftReference<A>(a3,queue);
		SoftReference<A> softReference4=new SoftReference<A>(a4,queue);
		SoftReference<A> softReference5=new SoftReference<A>(a5,queue);

		a1=null;
		a2=null;
		a3=null;
		a4=null;
		a5=null;
		
		System.gc();
		
		Thread.sleep(1000);
		
		SoftReference<A> softReference=(SoftReference<A>) queue.poll();
		
		System.out.println(softReference.get());
	}

}

class A{
	private int id=ReferenceQueueTest.id++;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A  ID:"+id;
	}
}
