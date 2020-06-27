package com.company.AccessModifiers;

import java.util.ArrayList;

public class Account {
    public String AccountName;
    public int balance;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        AccountName = accountName;
        this.transactions = new ArrayList<Integer>();

    }

    public String getAccountName() {
        return AccountName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited Balance is now " + this.balance);

        }else {
            System.out.println("Cannot deposit negative sums ");
        }
    }

    public void withdraw(int amount){
        int withdrawal =-amount;
        if(withdrawal<0){
            this.transactions.add(withdrawal);
            this.balance +=withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else if(withdrawal > balance) {
            System.out.println("There is no sufficient Balance");

        }else{
            System.out.println("Cannot withdrwal negative sum");
        }
    }
}
