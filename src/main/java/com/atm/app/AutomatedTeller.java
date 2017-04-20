package com.atm.app;
import javax.money.MonetaryAmount;

public class AutomatedTeller implements Teller{
    private CashSlot cashSlot;
    
    public AutomatedTeller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void withdrawFrom(Account account, MonetaryAmount dollars) {
        cashSlot.dispense(dollars);
        account.debit(dollars);
    }
}
