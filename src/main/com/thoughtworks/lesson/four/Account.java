package com.thoughtworks.lesson.four;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class Account {
    private long balance;
    public Account(long balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = 0;
    }

    public void transfer(Account debit, long amountToTranfer) throws Exception{
        if(balance < amountToTranfer){
            throw new Exception();
        }else{
            this.balance -= amountToTranfer;
            debit.addBalance(amountToTranfer);
        }
    }

    private void addBalance(long amountToTranfer) {
        this.balance +=amountToTranfer;
    }
}
