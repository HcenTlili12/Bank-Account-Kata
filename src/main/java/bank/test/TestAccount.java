package bank.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bank.operations.AccountCreation;

public class TestAccount {
private AccountCreation account;
@Before
public void init() {
	account= new AccountCreation("owner",200,"simple");
	account.deposite(50);
}
@Test
public void testAccountCreation() {
	assertEquals( "owner", account.getOwner_name()); // Tester la création du compte
}
@Test
public void testDeposit() {
	assertEquals( 250, account.getAccount_amount(),0); //Verser une somme dans le compte.
}
@Test
public void testBalance() {
	assertEquals( 50, account.getAccount_balance(),0);// Consulter balance
}
@Test
public void testWithdraw() {
	account.withdraw(20);// Diminuer le montant du compte
	assertEquals( 230, account.getAccount_amount(),0);
}
@Test
public void addOperationTest() {
	account.withdraw(10);
	account.display_details();// Vois les détails
	assertEquals( 2,account.getOperations().size());
}
}
