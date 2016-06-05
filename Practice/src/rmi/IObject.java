package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IObject extends Remote{
	void decription() throws RemoteException; 
}
