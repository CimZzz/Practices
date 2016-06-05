package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiObject extends UnicastRemoteObject implements IObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6921728349251768887L;

	public RmiObject() throws RemoteException {
		super();
	}

	@Override
	public void decription() throws RemoteException {
		System.out.println("GetRmiObject");
	}

}
