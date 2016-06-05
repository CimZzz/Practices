package classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 * 结论：类加载器必须为代理接口的加载器，第二个参数是可代理的类型,第三个参数为控制器
 * @author CimZzz
 *
 */
public class ProxyTest {

	public static void fun(Interface inter)
	{
		inter.fun();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface inter=(Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new NewInvocation(new ImpInterface()));
		fun(inter);
	}

}

interface Interface{
	void fun();
}

class ImpInterface implements Interface{

	@Override
	public void fun() {
		System.out.println("运行！");
	}
}

class NewInvocation implements InvocationHandler{
	private Interface inter;
	
	public NewInvocation(Interface inter) {
		this.inter=inter;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		method.invoke(inter, args);
		System.out.println(proxy.getClass());
		return null;
	}
	
}