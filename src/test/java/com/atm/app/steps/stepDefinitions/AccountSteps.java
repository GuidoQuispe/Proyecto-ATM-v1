package com.atm.app.steps.stepDefinitions;
import com.atm.app.Account;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.math.BigDecimal;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import junit.framework.Assert;
import org.javamoney.moneta.Money;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountSteps {
    @Autowired
    Account account;
    MonetaryAmount money;
    
    @Dado("^que mi cuenta ha sido acreditada con Bs(\\d+\\.\\d+|\\d+)$")
    public void miCuentaHaSidoAcreditadaConBs(String amount) throws Throwable {
        money = Money.of(new BigDecimal(amount), 
                                        Monetary.getCurrency("BOB"));
        account.credit(money);
    }
    
    @Entonces("^el saldo de mi cuenta debe ser de Bs(\\d+\\.\\d+|\\d+)$")
    public void elSaldoDeMiCuentaDebeSerDeBs(String amount)throws Throwable{
        money = Money.of(new BigDecimal(amount), 
                                        Monetary.getCurrency("BOB"));
        Assert.assertEquals("El saldo es incorrecto -", 
                            money, account.getBalance());
    }
}