package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException
	{
		IObject rmi = (IObject) Naming.lookup(RmiServer.RMI_URL);
		
		rmi.decription();
		
		
	}
}