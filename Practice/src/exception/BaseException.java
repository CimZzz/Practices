package exception;

import java.sql.Connection;

public class BaseException {

	public static class A{
		void haha() throws Exception
		{
			throw new Exception();
		}
	}
	
	public static class B extends A{
		void haha()
		{
			System.out.println("haha");
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		B a=new B();
		a.haha();
	}

}
