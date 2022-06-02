package com.cg.demo.obj;
import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[]args) {
		System.out.println("welcome to Scanner Demo app");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your name");
		String myname = sc.next();
		System.out.println(myname);
		
		System.out.println("please enter your salary");
		double salary = sc.nextDouble();
		System.out.println(salary);
		
		System.out.println("please enter phone");
		long phone = sc.nextLong();
		System.out.println(phone);

		System.out.println("thanks for using this app");
		
		
	}

}
