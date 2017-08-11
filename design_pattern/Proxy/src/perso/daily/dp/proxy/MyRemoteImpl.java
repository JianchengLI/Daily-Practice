package perso.daily.dp.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hi'";
	}
	
	public static void main(String[] args){
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
