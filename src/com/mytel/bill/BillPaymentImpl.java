package com.mytel.bill;

import java.util.Scanner;

import com.mytel.optionslist.MytelServicesImpl;
import com.mytel.payment.PaymentDetails;
import com.mytel.payment.PaymentDetailsImpl;

public class BillPaymentImpl implements BillPayment {
	Scanner scan = new Scanner(System.in);

	@Override
	public void printBillDueDetails() {
		System.out.println("Enter mobile number:");
		String number = scan.next();

		if (number.length() == 10) {

			PaymentDetails paymentDetails = new PaymentDetailsImpl();
			boolean billDetailsEntered = paymentDetails.billDetailsEntered();

			if (billDetailsEntered) {
				System.out.println("Congratulations..your bill amount is paid successful..");
			} else {
				System.out.println("Interruption happened try later");
			}

			MytelServicesImpl mytelServices = new MytelServicesImpl();
			mytelServices.selectNextMove();
		} else {
			System.out.println("Enter 10 digit valid number");
			printBillDueDetails();
		}
	}
}
