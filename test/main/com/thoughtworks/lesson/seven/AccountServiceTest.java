package com.thoughtworks.lesson.seven;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountServiceTest {

    @Test
    public void testTransfer() throws Exception {
        MockAccountManager mockAccountManager = new MockAccountManager();
        Account sender = new Account("1", 200);
        Account beneficiary = new Account("2", 100);
        mockAccountManager.addAmount("1", sender);
        mockAccountManager.addAmount("2", beneficiary);
        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);
        accountService.transfer("1", "2", 50);
        assertEquals(150, sender.getBalance());
        assertEquals(150, beneficiary.getBalance());
    }
}