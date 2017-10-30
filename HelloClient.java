package com.rmi.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {
	public static void main(String[] args) {
		try {
			IHello rhello = (IHello) Naming.lookup("rmi://127.0.0.1:8888/RHello");
			System.out.println(rhello.sayHello("world"));
			System.out.println(rhello.sum(12, 120));
			System.out.println(rhello.getUser());
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
