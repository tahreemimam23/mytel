package com.mytel.recharge;

import java.util.Scanner;

import com.mytel.optionslist.MytelServicesImpl;
import com.mytel.payment.PaymentDetails;
import com.mytel.payment.PaymentDetailsImpl;

public class MobileRechargeImpl implements MobileRecharge {
	Scanner scan = new Scanner(System.in);

	@Override
	public void rechargeMobile() {
		System.out.println("Enter mobile number:");
		String number = scan.next();

		if (number.length() == 10) {
			System.out.println("PACKAGES.......");

			System.out.println("PACKAGE 1: \r\n" + "Amount 200\r\n" + "Validity 30 days\r\n" + "Data 3GB/day");

			System.out.println("PACKAGE 2: \r\n" + "Amount 300\r\n" + "Validity 30 days\r\n" + "Data 6GB/day");

			System.out.println("Enter the appropriate package number to proceed further");
			int packageNumber = scan.nextInt();
			switch (packageNumber) {
			case 1:
				System.out.println("Package 1 chosen .... proceeding further");
				break;
			case 2:
				System.out.println("Package 2 chosen .... proceeding further");
				break;
			default:
				System.out.println("Entered wrong option... Terminating operation... Please try later");
				System.exit(0);
			}

			PaymentDetails paymentDetails = new PaymentDetailsImpl();
			boolean billDetailsEntered = paymentDetails.billDetailsEntered();

			if (billDetailsEntered) {
				System.out.println("Congratulations..your recharge is successful..");
			} else {
				System.out.println("Interruption happened try later");
			}

			MytelServicesImpl mytelServices = new MytelServicesImpl();
			mytelServices.selectNextMove();

		} else {
			System.out.println("Enter 10 digit valid number");
			rechargeMobile();
		}
	}
}
