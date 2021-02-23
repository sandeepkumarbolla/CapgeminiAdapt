package io.springcore.Q3;
import java.util.Scanner;
import org.springframework.stereotype.Component;
@Component
public class BankAccountServiceImpl implements BankAccountService {
	double withdrawAmount;
	double depositAmount;
	int initialBalance= 100000;
	public double withdraw(long accountId, double withdrawAmount) {
		this.withdrawAmount=withdrawAmount;
		System.out.println("The amount that is withdrawn is: "+withdrawAmount);
		return 0;}
	public double deposit(long accountId, double depositAmount) {
		this.depositAmount= depositAmount;
		System.out.println("The amount that is deposited is: "+depositAmount);
				return 0;}
	public double getBalance(long accountId) {
		System.out.println("Enter the respective number please: 1.Deposit \n 2.Withdrawl");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("The amount in "+accountId+" after depositing "+depositAmount+" is: "+(initialBalance+depositAmount ) );}
		else
			System.out.println("The amount in "+accountId+" after with drwaing "+withdrawAmount+" is: "+(initialBalance-withdrawAmount ) );	
		return 0;}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) 
	{
		return false;
	}
}