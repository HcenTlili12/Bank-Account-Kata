package bank.model;

import java.util.*;


 public class  BankAccount{
    protected String owner_name;
	protected String account_type;
    protected int account_num;
    protected float account_amount;
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	protected float account_balance;
	protected List<Operation> operations;
    protected BankAccount(){
      
    }
        public BankAccount(String owner_name, String account_type, int account_num, float account_amount,
			float account_balance, List<Operation> operations) {
		super();
		this.owner_name = owner_name;
		this.account_type = account_type;
		this.account_num = account_num;
		this.account_amount = account_amount;
		this.account_balance = account_balance;
		this.operations = operations;
	}
		BankAccount(String n,int acc_num,float balance,float amount,String a_t){
        	owner_name=n;
        	account_num=acc_num;
            account_balance=balance;
            account_type=a_t;
            account_amount= amount;
        }
		public String getOwner_name() {
			return owner_name;
		}
		public void setOwner_name(String owner_name) {
			this.owner_name = owner_name;
		}
		public String getAccount_type() {
			return account_type;
		}
		public void setAccount_type(String account_type) {
			this.account_type = account_type;
		}
		public int getAccount_num() {
			return account_num;
		}
		public float getAccount_amount() {
			return account_amount;
		}
		public void setAccount_amount(float account_amount) {
			this.account_amount = account_amount;
		}
		public void setAccount_balance(float account_balance) {
			this.account_balance = account_balance;
		}
		public void setAccount_num(int account_num) {
			this.account_num = account_num;
		}
		public float getAccount_balance() {
			return account_balance;
		}
		public void setAccount_balance(int account_balance) {
			this.account_balance = account_balance;
		}
} 
