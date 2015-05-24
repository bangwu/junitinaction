package com.thoughtworks.lesson.four;

import org.junit.Test;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class TestAccount {
    @Test(expected = Exception.class)
    public void tranferWithoutEnoughFunds() throws Exception {
        long balance = 1000;
        long amountToTransfer = 2000;
        Account credit = new Account(balance);
        Account debit = new Account();
        credit.transfer(debit, amountToTransfer);
    }

    @Test
    public void transferSuccess() throws Exception {
        long balance = 2000;
        long amountToTransfer = 1000;
        Account account = new Account(balance);
        Account account1 = new Account();
        account.transfer(account1,amountToTransfer);
    }
}
