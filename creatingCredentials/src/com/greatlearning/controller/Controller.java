package com.greatlearning.controller;

import java.util.Scanner;

import com.greatlearning.sample.Emply;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = false;
		Scanner sc = new Scanner(System.in);

		Emply emply = new Emply("Aiup", "Khan");
		CredSer credSer = new CredSer();

		do {
			System.out.println(
					" Please enter the department from the following \n 1. Technical\n 2. Admin\n 3. Human Resource\n 4. Legal");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				credSer.displayCred(emply.getfName(), emply.getlName(), "tech");
				flag = true;
				break;
			case 2:
				credSer.displayCred(emply.getfName(), emply.getlName(), "admin");
				flag = true;
				break;
			case 3:
				credSer.displayCred(emply.getfName(), emply.getlName(), "hr");
				flag = true;
				break;
			case 4:
				credSer.displayCred(emply.getfName(), emply.getlName(), "legal");
				flag = true;
				break;

			default:
				System.out.println("Invalid Choice");
				flag = false;
				break;
			}

		} while (flag == false);

		sc.close();
	}
}