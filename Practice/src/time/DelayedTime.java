package time;

/**
 * 时间测试
 * 1.保留小数点5位
 * @author CimZzz
 *
 */
public class DelayedTime {
	private float oldtime;
	
	public void start()
	{
		oldtime=System.nanoTime();
	}
	
	public String end()
	{
		return String.format("%.5f", (System.nanoTime()-oldtime)/1000000000f);
	}
	
	public static void main(String[] args) {
		DelayedTime delayedTime=new DelayedTime();
		delayedTime.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(delayedTime.end());
	}

}
