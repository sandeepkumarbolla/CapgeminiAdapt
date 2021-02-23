package io.springcore.Q3;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Controller {
	double withdrawAmount;
	double depositAmount;
	int initialBalance= 100000;
	public double withdraw(long accountId, double withdrawAmount) 
	{
		this.withdrawAmount=withdrawAmount;
		System.out.println("The amount that is withdrawn is: "+withdrawAmount);
		return 0;}
	public double deposit(long accountId, double depositAmount) {
		this.depositAmount= depositAmount;
		System.out.println("The amount that is deposited is: "+depositAmount);
				return 0;}
	public double getBalance(long accountId) {
		System.out.println("Enter the respective number please: 1.Did you just Deposited? \n 2.Did you just Withdrawl? \n 3.Neither depoisted nor withdrawn");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("The amount in "+accountId+" after depositing "+depositAmount+" is: "+(initialBalance+depositAmount ) );}
		if(choice==2) {
			System.out.println("The amount in "+accountId+" after with drwaing "+withdrawAmount+" is: "+(initialBalance-withdrawAmount ) );}
		if(choice==3) System.out.println("The account balance is: "+initialBalance);
		return 0;}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return false;
		}
}
