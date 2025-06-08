package com.project.profile;

import java.util.Scanner;

import com.mytel.optionslist.MytelServices;

public class ProfileDetails {
	Scanner scan = new Scanner(System.in);

	public void printProfileDetails() {
		System.out.println("Enter mobile number:");
		String number = scan.next();

		if (number.length() > 0 && number.length() == 10) {
			System.out.println("Name: Rahul");
			System.out.println("Address: Ameerpet, Hyderabad");

			MytelServices mytelServices = new MytelServices();
			mytelServices.selectNextMove();

		} else {
			System.out.println("Enter 10 digit valid number");
			printProfileDetails();
		}

	}

}
