package com.thoughtworks.lesson.seven;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class Account {
    private String accountId;
    private long balance;

    public Account(String accountId, long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void debit(long amount){
        this.balance -= amount;
    }

    public void credit(long amount){
        this.balance += amount;
    }

    public long getBalance(){
        return this.balance;
    }
}
