package support;
import com.atm.app.Account;
import com.atm.app.Teller;
import com.atm.app.steps.hooks.ServerHooks;
import javax.money.MonetaryAmount;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

public class AtmUserInterface implements Teller {
    @Autowired
    private EventFiringWebDriver webDriver;
    
    public void withdrawFrom(Account account, MonetaryAmount amount){

            webDriver.get("http://localhost:" + ServerHooks.PORT);
            webDriver.findElement(By.id("Amount"))
                     .sendKeys(String.valueOf(amount.getNumber()));
            webDriver.findElement(By.id("Withdraw")).click();
    }
}
