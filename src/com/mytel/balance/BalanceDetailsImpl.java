package com.mytel.balance;

import java.util.Scanner;

import com.mytel.optionslist.MytelServicesImpl;

public class BalanceDetailsImpl implements BalanceDetails {
	Scanner scan = new Scanner(System.in);

	@Override
	public void displayBalanceDetails() {
		System.out.println("Enter mobile number:");
		String number = scan.next();

		if (number.length() == 10) {
			System.out
					.println("Balance : Rs 600\r\n" + "SMS : 30\r\n" + "Talktime : unlimited\r\n" + "Data : 1.GB\r\n");

			MytelServicesImpl mytelServices = new MytelServicesImpl();
			mytelServices.selectNextMove();

		} else {
			System.out.println("Enter 10 digit valid number");
			displayBalanceDetails();
		}
	}
}
