package com.raphael.model;

import java.util.List;

import static com.raphael.model.BankService.ACCOUNT;

public class AccountWallet extends Wallet{

    private final List<String> pix;

    public AccountWallet(final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
    }

    public AccountWallet(final long amount, List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
        addMoney(amount, "valor da criação da conta");
    }

    public void addMoney(final long amount, final String description){
        var money = generateMoney(amount, description);
        this.money.addAll(money);
    }

}
