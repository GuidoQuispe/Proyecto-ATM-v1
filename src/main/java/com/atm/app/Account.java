package com.atm.app;
import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;

public class Account {
    MonetaryAmount balance;
    CurrencyUnit currency;

    public Account() {
        this.currency = Monetary.getCurrency("BOB");
        this.balance = Money.of(0, currency);
    }
    public void credit(MonetaryAmount amount) {
        balance = balance.add(amount);
    }
    public void debit(MonetaryAmount amount) {
        balance = balance.subtract(amount);
    }
    public MonetaryAmount getBalance() {
        return balance;
    }
}