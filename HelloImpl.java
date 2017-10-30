package com.rmi.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello{

	protected HelloImpl() throws RemoteException {
		super();
	}
	private static final long serialVersionUID = 1L;
	
	@Override
	public String sayHello(String name) {
		return "Hello, " + name;
	}
	@Override
	public int sum(int a, int b) {
		return a+b;
	}
}
