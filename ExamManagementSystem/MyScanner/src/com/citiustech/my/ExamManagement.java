package com.citiustech.my;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class ExamManagement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to exam management system");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("-----------------Please Select Your Role-----------");
			System.out.println("1. Admin");
			System.out.println("2. Student");
			System.out.println("0. Exit");
			System.out.println("------------------------------------------------------------");
			System.out.print("Enter Your choice: ");
			int c = Integer.parseInt(br.readLine());
			System.out.println("------------------------------------------------------------");

			while (true) {
				System.out.println("Press 1 to Add student");
				System.out.println("Press 2 to Delete student");
				System.out.println("Press 3 to Display student");
				System.out.println("Press 4 to Exit student");

				// int c = Integer.parseInt(br.readLine());

				if (c == 1) {
					// add student

				} else if (c == 2) {
					// delete student

				} else if (c == 3) {
					// display students
				} else if (c == 4) {
					// exit
					break;
				} else {

				}
				System.out.println("Thank you for visist!!!");
				System.out.println("See you .. Bye Bye");
				System.out.println("==================================");
			}

		}
	}

}
