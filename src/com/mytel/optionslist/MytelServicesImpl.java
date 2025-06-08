package com.mytel.optionslist;

import java.util.Scanner;

import com.mytel.balance.BalanceDetails;
import com.mytel.balance.BalanceDetailsImpl;
import com.mytel.bill.BillPayment;
import com.mytel.bill.BillPaymentImpl;
import com.mytel.convertion.ConvertionProcess;
import com.mytel.convertion.ConvertionProcessImpl;
import com.mytel.profile.ProfileDetails;
import com.mytel.profile.ProfileDetailsImpl;
import com.mytel.recharge.MobileRecharge;
import com.mytel.recharge.MobileRechargeImpl;

public class MytelServicesImpl implements MytelServices {

	Scanner scan = new Scanner(System.in);

	@Override
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
			MobileRecharge mobileRecharge = new MobileRechargeImpl();
			mobileRecharge.rechargeMobile();
			break;
		case 2:
			System.out.println("Bill Payment Service......");
			BillPayment bill = new BillPaymentImpl();
			bill.printBillDueDetails();
			break;
		case 3:
			System.out.println("SIM Convertion Service......");
			ConvertionProcess convertionProcess = new ConvertionProcessImpl();
			convertionProcess.convertionDetails();
			break;
		case 4:
			System.out.println("Displaying Balance Details......");
			BalanceDetails balanceDetails = new BalanceDetailsImpl();
			balanceDetails.displayBalanceDetails();
			break;
		case 5:
			System.out.println("Profile Details......");
			ProfileDetails profile = new ProfileDetailsImpl();
			profile.printProfileDetails();
			break;
		default:
			System.out.println("Invalid option number... Terminating operation");
		}

	}

	@Override
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
