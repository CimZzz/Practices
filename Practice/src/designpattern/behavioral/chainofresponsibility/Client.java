package designpattern.behavioral.chainofresponsibility;


/**
 * 测试：Chain Of Responsibility 的了解与使用
 * 将接受处理请求的对象连接成一条链，将请求从最外层传递至最内层；在传递过程中如果有对象可以处理此请求，
 * 则中断请求链并处理请求。
 * 一般和组合模式一起使用
 * @author CimZzz
 *
 */
public class Client {

	public static void main(String[] args) {
		Application application = new Application();
		
		Handler handler = new Table(application, Handler.HANDLE+1);
		handler = new Table(handler, Handler.HANDLE+1);
		handler = new Table(handler, Handler.HANDLE+1);
		handler = new Button(handler, Handler.HANDLE+1);
		handler = new Table(handler, Handler.HANDLE+1);
		handler = new Button(handler, Handler.HANDLE+1);
		handler = new Table(handler, Handler.HANDLE+1);
		handler = new Button(handler, Handler.HANDLE+1);
		
		handler.click();
		

		handler = new Table(handler, Handler.HANDLE);
		
		handler.click();
	}

}
