package com.atm.app.steps.stepDefinitions;
import com.atm.app.CashSlot;
import cucumber.api.java.es.Entonces;
import java.math.BigDecimal;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import junit.framework.Assert;
import org.javamoney.moneta.Money;
import org.springframework.beans.factory.annotation.Autowired;

public class CashSlotSteps {
    @Autowired
    CashSlot cashSlot;
    
    @Entonces("^Bs(\\d+\\.\\d+|\\d+) deben ser dispensados$")
    public void BsDebenSerDispensados(String amount) throws Throwable {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MonetaryAmount money = Money.of(new BigDecimal(amount), 
                                        Monetary.getCurrency("BOB"));
        Assert.assertEquals("Efectivo dispensado incorrectamente -",
                            money, cashSlot.getContents());
    }
}






