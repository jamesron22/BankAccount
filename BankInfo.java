package com.company;

public class BankInfo {
    private int accntNum;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    public BankInfo(int accntNum, double balance, String customerName, String email, String phoneNum) {
        super();
        this.accntNum = accntNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public int getAccntNum() {
        return accntNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAccntNum(int accntNum) {
        this.accntNum = accntNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setWithdraw(double Withdraw) {
        if (Withdraw >= this.balance) {
            System.out.println(" Error: Withdraw is greater than your balance.");
        }
        else {
            this.balance = balance - Withdraw;
        }
    }

    public void setDeposit(double Deposit) {
        this.balance = balance + Deposit;
    }
}

