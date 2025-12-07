package com.tp;

import proxy.Account;
import proxy.BankAccountService;
import proxy.BankWS;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankAccountService proxy = new BankWS().getBankAccountServicePort();
        System.out.println(proxy.conversionEuroToDh(10));
        Account account = proxy.getAccount(3);
        System.out.println(account.getCode());
        List<Account> accounts = proxy.getAccounts();
        System.out.println(accounts.getFirst().getCode());
    }
}
