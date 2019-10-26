package com.company;

public class Main {

    public static void main(String[] args) {
        BankInfo NewAccount = new BankInfo(12345, 1000, "Jim Anderson", "jim.anderson44@email.com", "901-555-5555");
        System.out.println(NewAccount.getAccntNum());
        System.out.println(NewAccount.getBalance());
        System.out.println(NewAccount.getCustomerName());
        System.out.println(NewAccount.getEmail());
        System.out.println(NewAccount.getPhoneNum());

        NewAccount.setWithdraw(100.00);
        System.out.println(NewAccount.getBalance());

        NewAccount.setDeposit(200.01);
        System.out.println(NewAccount.getBalance());
    }
}
