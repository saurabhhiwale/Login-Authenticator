package com.authenticator;

import java.util.Scanner;

public class Authenticator {
	
	static Scanner sc=new Scanner(System.in);
	
	public static String set_username;
	public static String set_password;
	public static char choice;
	public static String username;
	public static String password;
	
	public static void setCredentials() {
		System.out.println("Welcome On My Login Portal !!");
		System.out.println("---------------------------");
		
		while(true) {
			
			System.out.println("Set Username: ");
			set_username=sc.next();
			
			if(set_username.contains("@") && set_username.contains(".")) {
				System.out.println("Set Password: ");
				set_password=sc.next();
				break;			
			}
			else {
				System.out.println("Username Must be a Gmail!!");
				System.out.println();
			}	 
		}	
	}
	
	public static void userChoice() {
		 
		System.out.println();
		do{System.out.println("Enter y for Login and n for Exit!!");
		choice=sc.next().toLowerCase().charAt(0);
		}
		while(choice !='y' && choice !='n');				
	}
	
	public static void  getCredentials(){
		
		if(choice=='y') {
			System.out.println("Enter Username: ");
			username=sc.next();
			System.out.println("Enter Password: ");
			password=sc.next();
		}
		else {
			System.out.println("Thank you.. Have a nice day!!");
			System.exit(0);
		}
	}
	
	public static void checkCredentials() {
		
		setCredentials();
		userChoice();
		
		int attempts=3;
		
		while(attempts>0) {
			getCredentials();
			if(set_username.equals(username)) {
				if(set_password.equals(password)) {
					System.out.println();
					System.out.println("Login Successful");
					System.out.println("...WELCOME...");
					break;
				}
				else {
					System.out.println("Invalid Password!!");
					System.out.println();
				}
			}
			else {
				System.out.println("Invalid Username!!");
				System.out.println();
			}
			attempts--;
			System.out.println("You have "+attempts+" Attempts Left..");
			System.out.println();
		}
		
		System.exit(0);
	}
	
	public static void main(String[] args) {
		checkCredentials();
		System.out.println("Thanks You for Be Here");
		}
	}
