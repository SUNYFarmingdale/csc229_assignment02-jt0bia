package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab, JaredTobias
 */

public class DriverClass {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// user inputs for each field of the student class
		System.out.print("Enter your name: ");
		String userName = input.nextLine();

		System.out.print("Enter your age: ");
		short userAge = input.nextShort();

		System.out.print("Enter your GPA: ");
		double userGPA = input.nextDouble();

		// instance of the student class using scanner inputs as parameters
		Student std1= new Student(userName, userAge, userGPA);

		// output for GPA
		System.out.println("The GPA for " + std1.getName() + " is " + std1.getGPA());
	}

}