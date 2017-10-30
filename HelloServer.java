package com.rmi.test; 
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
	public static void main(String[] args) {
		try {
			IHello rhello = new HelloImpl();
			LocateRegistry.createRegistry(8888);
			Naming.bind("rmi://127.0.0.1:8888/RHello", rhello);
			System.out.println(">>INFO:远程IHello对象绑定成功！");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.out.println("发生URL异常");
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			System.out.println("发生重复绑定对象异常！");
			e.printStackTrace();
		}
	}
}
