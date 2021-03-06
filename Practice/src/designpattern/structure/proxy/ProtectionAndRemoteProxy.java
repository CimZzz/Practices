package designpattern.structure.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 远程代理与访问控制代理
 * @author CimZzz
 *
 */
public class ProtectionAndRemoteProxy implements IObject,ProxyInterface<IObject>{
	public static final int ACCESS_PERMISSION = 1;
	public static final int NOT_ACCESS_PERMISSION = 0;
	
	private static int permission = 0;

	private IObject iObject;
	
	@Override
	public void description() throws RemoteException {
		if(permission != ACCESS_PERMISSION)
		{
			System.out.println("没有访问权限");
			return;
		}

		getObject().description();
	}
	
	public static void setPermission(int permission) {
		System.out.println("权限改变");
		ProtectionAndRemoteProxy.permission = permission;
	}

	@Override
	public IObject getObject() {
		if(iObject == null)
		{
			try {
				iObject = (IObject) Naming.lookup(RMIAbout.URL);
			} catch (MalformedURLException | RemoteException | NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return iObject;
	}
}
