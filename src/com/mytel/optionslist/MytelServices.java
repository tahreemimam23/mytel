package com.mytel.optionslist;

import java.util.Scanner;

import com.mytel.balance.BalanceDetails;
import com.mytel.bill.BillPay;
import com.mytel.convertion.ConvertionProcess;
import com.mytel.recharge.MobileRecharge;
import com.project.profile.ProfileDetails;

public class MytelServices {

	Scanner scan = new Scanner(System.in);

	public void mytelServicesList() {
		System.out.println("Welcome to Mytel :");
		System.out.println("Enter option 1 for mobile recharge\r\n" + "Enter option 2 for pay bills\r\n"
				+ "Enter option 3 to convert prepaid to postpaid / postpaid to prepaid\r\n"
				+ "Enter option 4 to know the balance\r\n" + "Enter option 5 for profile details\r\n"
				+ "Enter 0 to exit");
		int Option = scan.nextInt();

		switch (Option) {
		case 0:
			System.out.println("Operation Terminated");
			System.exit(0);
			break;
		case 1:
			System.out.println("Extra Small");
			MobileRecharge mobileRecharge = new MobileRecharge();
			mobileRecharge.rechargeMobile();
			break;
		case 2:
			System.out.println("Bill Payment Service......");
			BillPay bill = new BillPay();
			bill.printBillDueDetails();
			break;
		case 3:
			System.out.println("SIM Conversion Service......");
			ConvertionProcess convertionProcess = new ConvertionProcess();
			convertionProcess.convertionDetails();
			break;
		case 4:
			System.out.println("Displaying Balance Details......");
			BalanceDetails balanceDetails = new BalanceDetails();
			balanceDetails.displayBalanceDetails();
			break;
		case 5:
			System.out.println("Profile Details......");
			ProfileDetails profile = new ProfileDetails();
			profile.printProfileDetails();
			break;
		default:
			System.out.println("Invalid option number... Terminating operation");
		}

	}

	public void selectNextMove() {
		System.out.println("Enter option 9 to go back to main options\r\n" + "Enter 0 to exit\r\n");
		int option = scan.nextInt();
		switch (option) {
		case 0:
			System.out.println("Operation Terminated");
			System.exit(0);
			break;
		case 9:
			System.out.println("Going back to main menu");
			mytelServicesList();
			break;
		default:
			System.out.println("Entered wrong option... Terminating operation... Please try later");
			System.exit(0);
		}

	}
}
