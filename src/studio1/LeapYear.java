package studio1;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean isLeapYear; 
		

		System.out.println("What year?");
		int year = in.nextInt();


		isLeapYear = ((year%4==0) && (year%100!=0))||(year%400==0);
		System.out.println ("Is it a leap year? "+isLeapYear);
		


	}

}
