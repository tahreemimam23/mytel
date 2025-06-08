package com.mytel.launch;

import com.mytel.optionslist.MytelServicesImpl;

public class MytelApp {

	public static void main(String[] args) {
		MytelServicesImpl mytelServices = new MytelServicesImpl();
		mytelServices.mytelServicesList();
	}
}
