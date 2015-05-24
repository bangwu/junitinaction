package com.thoughtworks.lesson.seven;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class MockAccountManager implements AccountManager {
    private Map<String, Account> accounts = new HashMap();

    public void addAmount(String userId, Account account){
        this.accounts.put(userId, account);
    }
    @Override
    public Account findAccountForUser(String userId) {
        return this.accounts.get(userId);
    }

    @Override
    public void updateAccount(Account account) {
    }
}
