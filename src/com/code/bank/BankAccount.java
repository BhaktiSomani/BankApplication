package com.code.bank;

public class BankAccount {
private int actid;
private String name;
private double balance,amount;
private Locker lockerobj;

public BankAccount() {
	actid=1001;
	name="Ram";
	balance=5000;
}
public BankAccount(int actid, String name, double balance) {
	super();
	this.actid = actid;
	this.name = name;
	this.balance = balance;
}
public int getAccid() {
	return actid;
}
public void setName(String name)
{
	this.name=name;
}
@Override
public String toString() {
	if(this.lockerobj==null)
	return "Bank Account Details: " + actid + " " +name + " " + balance +" No Locker assigned yet" ;
	else
		return "Bank Account: " + actid + " " + name + "   " + balance+"  "+lockerobj;	
}

static int lockerid ;
static {
	lockerid=1000;
}

public Locker getLockerObj() {
	return lockerobj;
}

public void setLockerObj(int duration) {
	this.lockerobj=new Locker(duration);
}

private class Locker{
	private int lockerId;
	private int duration;
	private double charges;
	public Locker(int duration) {
		this.lockerId = lockerid;
		this.duration = duration;
		this.charges = 500*duration;
	}
	
public String toString() {
	System.out.println("Locker For Customer "+name +"  Account Id="+actid);
	return "Locker Details: "+lockerId+"  Duration:"+duration+"    Charges:"+charges;
}
}

public void assignLocker(int duration) {
	lockerid=lockerid+1;
	this.lockerobj=new Locker(duration);
	
}

public void deposite(double amount) {
	balance=balance+amount;
}

public void withdraw(double amount) {
	balance=balance-amount;
}

}
