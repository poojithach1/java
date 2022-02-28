package com.company;

public class BankAccount {
    private String accountNumber ;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("it is empty");
    }

    public BankAccount(String accountNumber,double balance,String customerName,String email,String phoneNumber) {
        System.out.println("Account constructor with parameters ");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void withDraw(double withdrawalAmount) {
        if(this.balance-withdrawalAmount < 0) {
            System.out.println("Only" + this.balance +"available.Withdrawal is not possible");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal amount "+withdrawalAmount+".Remaining balance is " +this.balance);
        }
    }
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit amount " +depositAmount +"New balance is" +this.balance);
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

