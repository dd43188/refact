package com.water.middleman;

public class Consumer {
    AccountManager accountManager = null;

    public Consumer(AccountManager accountManager) {
        accountManager = accountManager;
    }

    public Account get(int id) {
        Account account = AccountManager.getInstance().getAccount(id);
        return account;
    }
}
