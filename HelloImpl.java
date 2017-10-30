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
	@Override
	public User getUser() {
		User user = new User();
		user.setAge(18);
		user.setEmail("achiberx@gmail.com");
		user.setName("xiaohuihui");
		return user;
	}
}
