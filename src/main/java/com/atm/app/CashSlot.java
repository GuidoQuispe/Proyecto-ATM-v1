package com.atm.app;
import javax.money.MonetaryAmount;

public class CashSlot {
    MonetaryAmount contents;

    public void dispense(MonetaryAmount amount) {
        contents = amount;
    } 
    public MonetaryAmount getContents() {
        return contents;
    } 
}
