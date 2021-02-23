package io.springcore.Q3;
import org.springframework.stereotype.Component;
@Component
public class BankAccount {
private long accountId;
private String accountHolderName;
private String accountType;
private int accountBalance;
public long getAccountId() {
	return accountId;
}
public void setAccountId(long accountId) {
	this.accountId = accountId;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public int getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(int accountBalance) {
	this.accountBalance = accountBalance;
}

}
