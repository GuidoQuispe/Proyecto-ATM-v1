package com.atm.app.steps.stepDefinitions;
import cucumber.api.java.es.Cuando;
import com.atm.app.Account;
import java.math.BigDecimal;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;
import org.springframework.beans.factory.annotation.Autowired;
import support.AtmUserInterface;

public class TellerSteps {
    @Autowired
    Account account;
    
    @Autowired
    AtmUserInterface teller;
        
    @Cuando("^retiro Bs(\\d+\\.\\d+|\\d+)$")
    public void retiroBs(String amount) throws Throwable {
        MonetaryAmount money = Money.of(new BigDecimal(amount), 
                                        Monetary.getCurrency("BOB"));
        teller.withdrawFrom(account, money);
    }
}


