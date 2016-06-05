package designpattern.structure.proxy;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 关于RMI远程对象访问的相关类
 * 作为RMI的服务端
 * @author CimZzz
 *
 */
public class RMIAbout {
	private static final int PORT = 10201;
	public static final String URL = "rmi://localhost:10201/ConcreteObject";
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException
	{
		IObject obejct = new ConcreteObject(20);
		
		LocateRegistry.createRegistry(PORT);
		
		Naming.bind(URL, obejct);
		
		System.out.println("远程对象已经绑定");
	}
}

/**
 * RMI对象的共同接口
 * @author CimZzz
 *
 */
interface IObject extends Remote{
	void description() throws RemoteException;
}

/**
 * 具体类，也就是分享的类
 * @author CimZzz
 *
 */
class ConcreteObject extends UnicastRemoteObject implements IObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2461408573413057130L;

	private int number;
	
	public ConcreteObject(int number) throws RemoteException {
		super();
		
		this.number = number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public void description() throws RemoteException{
		System.out.println("Concreted Description:Number = "+number);
	}
}
