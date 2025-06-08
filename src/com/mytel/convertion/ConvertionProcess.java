package com.mytel.convertion;

import java.util.Scanner;

import com.mytel.optionslist.MytelServices;

public class ConvertionProcess implements Convertion {
	Scanner scan = new Scanner(System.in);

	@Override
	public void convertionDetails() {
		System.out.println("Enter mobile number:");
		String number = scan.next();

		if (number.length() == 10) {
			System.out.println(
					"Enter option 6 to convert prepaid to post\r\n" + "Enter option 7 to convert post to prepaid");
			int option = scan.nextInt();
			switch (option) {
			case 6:
				System.out.println(
						"Congrats!!your request is received. You new SIM will be delivered within 2 days to your address");
				break;
			case 7:
				System.out.println(
						"Congrats!!your request is received. You new SIM will be delivered within 2 days to your address");
				break;
			default:
				System.out.println("Entered wrong option... Terminating operation... Please try later");
				System.exit(0);
			}

			MytelServices mytelServices = new MytelServices();
			mytelServices.selectNextMove();

		} else {
			System.out.println("Enter 10 digit valid number");
			convertionDetails();
		}
	}
}
