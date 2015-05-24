package com.thoughtworks.lesson.seven;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public interface AccountManager {
    Account findAccountForUser(String userId);
    void updateAccount(Account account);
}
