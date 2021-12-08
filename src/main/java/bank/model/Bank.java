package bank.model;

import java.util.List;

public class Bank {
private List<BankAccount> accounts;

public List<BankAccount> getAccounts() {
	return accounts;
}

public Bank(List<BankAccount> accounts) {
	super();
	this.accounts = accounts;
}

public void setAccounts(List<BankAccount> accounts) {
	this.accounts = accounts;
}
public void addAccount(BankAccount ba) {
	this.accounts.add(ba);
}
}
