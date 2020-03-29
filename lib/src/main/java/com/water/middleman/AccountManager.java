package com.water.middleman;

public class AccountManager {
    private static AccountManager accountManager = new AccountManager();
    public AccountDataProvider dataProvider = null;

    public static AccountManager getInstance() {
        return accountManager;
    }

    public void init(AccountDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public Account getAccount(int id) {
        return dataProvider.GetAccount(id);
    }
}