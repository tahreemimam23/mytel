package com.mytel.profile;

import java.util.Scanner;

import com.mytel.optionslist.MytelServicesImpl;

public class ProfileDetailsImpl implements ProfileDetails {
	Scanner scan = new Scanner(System.in);

	@Override
	public void printProfileDetails() {
		System.out.println("Enter mobile number:");
		String number = scan.next();

		if (number.length() > 0 && number.length() == 10) {
			System.out.println("Name: Rahul");
			System.out.println("Address: Ameerpet, Hyderabad");

			MytelServicesImpl mytelServices = new MytelServicesImpl();
			mytelServices.selectNextMove();

		} else {
			System.out.println("Enter 10 digit valid number");
			printProfileDetails();
		}

	}

}
