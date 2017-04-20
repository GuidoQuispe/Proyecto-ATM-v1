package com.atm.app;
import javax.money.MonetaryAmount;

public interface Teller {
    void withdrawFrom(Account account, MonetaryAmount dollars);
}
