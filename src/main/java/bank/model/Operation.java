package bank.model;

import java.util.Date;

public class Operation {
Date date;
String type;
float amount;
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Operation(Date date, String type, float amount, float balance) {
	super();
	this.date = date;
	this.type = type;
	this.amount = amount;
	this.balance = balance;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
float balance;
public void displayOperation() {
	System.out.println("Date: "+this.getDate()+" ,Type "+this.getType()+" ,op. amount: "+this.getAmount()+ " ,balance: "+this.getBalance());
}
}
