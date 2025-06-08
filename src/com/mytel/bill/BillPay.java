package com.mytel.bill;

import java.util.Scanner;

import com.mytel.optionslist.MytelServices;
import com.mytel.payment.PaymentDetails;

public class BillPay {
	Scanner scan = new Scanner(System.in);

	public void printBillDueDetails() {
		System.out.println("Enter mobile number:");
		String number = scan.next();

		if (number.length() == 10) {

			PaymentDetails paymentDetails = new PaymentDetails();
			boolean billDetailsEntered = paymentDetails.billDetailsEntered();

			if (billDetailsEntered) {
				System.out.println("Congratulations..your bill amount is paid successful..");
			} else {
				System.out.println("Interruption happened try later");
			}

			MytelServices mytelServices = new MytelServices();
			mytelServices.selectNextMove();
		} else {
			System.out.println("Enter 10 digit valid number");
			printBillDueDetails();
		}
	}
}
