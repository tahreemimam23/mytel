package com.mytel.payment;

import java.util.Scanner;

public class PaymentDetails {
	Scanner scan = new Scanner(System.in);

	public boolean billDetailsEntered() {
		System.out.println("Enter payment details:");
		boolean flag = false;

		boolean isCardValid = validateDebitCard();
		boolean isDateValid = validateDate();
		boolean isCvvValid = validateCvv();

		if (isCardValid && isDateValid && isCvvValid)
			flag = true;
		else {
			System.out.println("Entered Wrong Payment details");
			billDetailsEntered();
		}
		return flag;
	}

	boolean validateDebitCard() {
		System.out.println("Enter debit card/credit card number:");
		String cardNumber = scan.next();
		boolean flag = false;

		if (cardNumber.length() == 16)
			flag = true;
		else {
			System.out.println("Enter 16 digit valid card number");
			validateDebitCard();
		}
		return flag;
	}

	boolean validateDate() {
		System.out.println("Enter Expiry date:");
		String expiryDate = scan.next();
		boolean flag = false;

		if (expiryDate.length() == 10)
			flag = true;
		else {
			System.out.println("Enter valid date in DD/MM/YYYY format");
			validateDate();
		}
		return flag;
	}

	boolean validateCvv() {
		System.out.println("Enter CVV number:");
		String cvv = scan.next();
		boolean flag = false;

		if (cvv.length() == 3)
			flag = true;
		else {
			System.out.println("Enter 3 digit valid CVV number");
			validateCvv();
		}
		return flag;
	}

}
