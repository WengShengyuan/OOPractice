package proxypattern.rmi.remote.impl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import proxypattern.rmi.remote.interfaces.MyRemote;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
		// 不需要自己写任何代码
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says: 'Hey'";
	}
	
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			LocateRegistry.createRegistry(1234);
			Naming.rebind("rmi://127.0.0.1:1234/RemoteHello", service);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
