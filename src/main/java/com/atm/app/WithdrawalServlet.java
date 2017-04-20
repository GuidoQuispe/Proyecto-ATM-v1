package com.atm.app;
import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import org.javamoney.moneta.Money;

public class WithdrawalServlet  extends HttpServlet { 
    private final CashSlot cashSlot;
    private final Account account;
    
    WithdrawalServlet(CashSlot cashSlot, Account account) {
        this.cashSlot = cashSlot;
        this.account = account;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                                throws ServletException, IOException { 
        Teller teller = new AutomatedTeller(cashSlot); 
        String amount = request.getParameter("amount");
        java.math.BigDecimal money = new BigDecimal(amount);
        teller.withdrawFrom(account, Money.of(money, "BOB"));
        response.setContentType("text/html"); 
        response.setStatus(HttpServletResponse.SC_OK); 
        response.getWriter().println( 
                "<html><head><title>ATM</title></head>" + 
                        "<body>Retire sus Bs" + amount + " del dispensador.</body>" + 
                        "</html>"); 
    }
} 