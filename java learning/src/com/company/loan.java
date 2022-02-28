package com.company;

public class loan extends BankAccount {
    private int loanAmount;
    private int aadhaarNumber;
    private int noOfYears;
    private int interest;
    public loan(String accountNumber, double balance, String customerName, String email, String phoneNumber,int loanAmount,int aadhaarNumber,int noOfYears,int interest) {
        super(accountNumber, balance, customerName, email, phoneNumber);
        this.loanAmount = loanAmount;
        this.aadhaarNumber = aadhaarNumber;
        this.noOfYears = noOfYears;
        this.interest = interest;
    }
    private void fullDetails() {
        System.out.println("if full details are correct then loan issued");
    }

    @Override
    public void withDraw(double withdrawalAmount) {
        System.out.println("loan extends BankAccount");
        fullDetails();
        super.withDraw(withdrawalAmount);
    }
}
