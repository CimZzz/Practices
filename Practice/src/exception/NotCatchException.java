package exception;

import java.util.Date;

public class NotCatchException {

	public static void test()
	{
		try{
			String x=null;
			x.length();
			
		}
		finally{
			System.out.println("HAHA");
		}

		System.out.println("HEIHEI");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		System.out.println("HEHE");
	}

}
