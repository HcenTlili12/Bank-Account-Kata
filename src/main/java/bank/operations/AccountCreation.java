package bank.operations;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bank.model.BankAccount;
import bank.model.Operation;
public class AccountCreation extends BankAccount{
public	AccountCreation(String n,float amount,String a_t){ //Account construction
		owner_name=n;
        account_num=(int)((Math.random() * 2000)+Math.random());  // generate random id of the account
        account_balance=0;
        account_amount=amount;
        account_type=a_t;
        operations= new ArrayList<Operation>();
}
AccountCreation(){
    super();
}
    
public void insert(String n,int acc_num,float acc_amt,String a_t,List<Operation> ops){ 
	owner_name=n;
    account_type=a_t;
    account_amount=acc_amt;
    account_num=(int)((Math.random() * 2000)+Math.random()); // generate random id of the account
    account_balance=0;
    operations=ops;
}

public void display_details(){
    System.out.println("Depositor Name :" +owner_name);
    System.out.println("Account Number : "+account_num);
    System.out.println("Account Balance : "+account_balance);
    System.out.println("Account Type : "+account_type);
    System.out.println("Account amount : "+account_amount);
    for(int i=0;i<operations.size();i++) {
    	operations.get(i).displayOperation();
    }
}

   public  void deposite(float money){                 
    	account_balance=account_balance+money;   
    	account_amount=account_amount+money;
    	operations.add(new Operation(new Date(),"deposit",money,account_balance));
    }
    
   public  float withdraw(float withd){
    	account_balance=account_balance-withd;
    	account_amount=account_amount-withd;
    	operations.add(new Operation(new Date(),"withdraw",withd,account_balance));
            return account_balance;
    }
}
