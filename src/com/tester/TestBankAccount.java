package com.tester;
import java.util.Scanner;
import com.code.bank.BankAccount;
public class TestBankAccount {

	public static void main(String[] args) {
		 System.out.println("1:Show all account details 2:Add new account "
		 		+ "3:Edit Name 4:Reomve account 5:Apply for locker 6: Show all locker holders 7:Exit");
	 
		 Scanner sc=new Scanner(System.in);
		 int ch,index=0;
		 BankAccount[] bankarr=new BankAccount[10];
		 do {
			 System.out.println("Enter your choice: ");
			 ch=sc.nextInt();
			 switch(ch){
			 
			 case 1:
				 if(index==0) {
					 System.out.println("No accont present in the bank");
				 }
				 else {
				 for(BankAccount b:bankarr) {
					 if(b!=null) {
					 System.out.println(b);
					 }
				 }
				 }
				 break;
			 
			 
			 case 2: 
				 if(index<bankarr.length) {
				 System.out.println("Enter account id , name , balance ");
				 bankarr[index]= new BankAccount(sc.nextInt(),sc.next(),sc.nextDouble());
				 index++;
				 System.out.println("Account details added !!");
				 }
				 else {
					 System.out.println("Array is full");
				 }
				 break;
			 case 3:
				 System.out.println("Enter account id: ");
				 int acid=sc.nextInt();
				 int flag=0;
				 for(BankAccount b:bankarr) {
					 if(b!= null) {
						if(b.getAccid()==acid) {
							flag=1;
							System.out.println("Enter name: ");
							b.setName(sc.next());
							System.out.println("Name has been changed ");
							break;
						} 
					 }
				 }
				 if (flag==0) {
					 System.out.println("Invalid account id ");
				 }
				 break;
				 
			 case 4: 
				 System.out.println("Enter account id: ");
				 int acid1=sc.nextInt();
				 int flag1=0;
				 for(int i=0;i<=bankarr.length;i++)
				 {
					if(bankarr[i]!=null) {
						if(bankarr[i].getAccid()==acid1) {
							flag1=1;
							bankarr[i]=null;
							System.out.println("Account has been removed");
							break;
						}
					} 
				 }				 
				 if (flag1==0) {
					 System.out.println("Invalid account id ");
				 }
				 break;
				 
			 case 5: 
				 System.out.println("Enter account id: ");
				 int acid2=sc.nextInt();
				 int flag2=0;
				 for(BankAccount b:bankarr) {
					 if(b!= null) {
						if(b.getAccid()==acid2) {
							flag2=1;
							System.out.println("Enter duration: ");
							b.assignLocker(sc.nextInt());
							System.out.println("Locker has been assigned to account id: "+acid2);
							break;
						} 
					 }
				 }
				 if (flag2==0) {
					 System.out.println("Invalid account id ");
				 }
				 break;
				 
			 case 6:
				 System.out.println("All the Lockers present in the bank: ");
				 for(BankAccount b:bankarr) {
					 if(b!=null) {
						 if(b.getLockerObj()!=null) {
							 System.out.println(b.getLockerObj());
						 }
					 }
				 }
				 System.out.println(" ");
				 break;
				 
			 case 7: 
				 System.out.println("Enter account id: ");
				 int acid3=sc.nextInt();
				 int flag3=0;
				 for(BankAccount b:bankarr) {
					 if(b!= null) {
						if(b.getAccid()==acid3) {
							flag3=1;
							System.out.println("Enter Amount to Deposite: ");
							b.deposite(sc.nextDouble());
							System.out.println("Amount deposited");
							break;
						} 
					 }
				 }
				 if (flag3==0) {
					 System.out.println("Invalid account id ");
				 }
				 break;
			 case 8: 
				 System.out.println("Enter account id: ");
				 int acid4=sc.nextInt();
				 int flag4=0;
				 for(BankAccount b:bankarr) {
					 if(b!= null) {
						if(b.getAccid()==acid4) {
							flag4=1;
							System.out.println("Enter Amount to withdraw: ");
							b.withdraw(sc.nextDouble());
							System.out.println("Amount withdrawed");
							break;
						} 
					 }
				 }
				 if (flag4==0) {
					 System.out.println("Invalid account id ");
				 }
				 break;
				 
			 case 9:System.out.println("Exit!!");
			        break;
			 }
			 
		 }while(ch!=9);
		
	 
		 }

	}

