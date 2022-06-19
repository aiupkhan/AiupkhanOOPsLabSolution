/**
 * 
 */
package com.greatlearning.controller;

import java.util.Random;

/**
 * @author Aiupkhan
 *
 */
public class CredSer {
	private String domain = ".abc.com";

	public char[] generatePassword() {

		String randomChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";

		Random random = new Random();
		char[] pass = new char[8];

		for (int i = 0; i < 8; i++) {
			pass[i] = randomChar.charAt(random.nextInt(randomChar.length()));
		}
		return pass;
	}

	public String generateEmail(String fName, String lName, String dept) {
		return fName + lName + "@" + dept + domain;
	}

	public void displayCred(String fname, String lName, String dept) {

		String emailId = generateEmail(fname, lName, dept);
		char[] password = generatePassword();

		System.out.println("\n Please find the employee credentials below : ");
		System.out.println("\n Email ID : " + emailId);
		System.out.println(" Password : " + password);

	}

}
