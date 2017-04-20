package com.atm.app.steps.hooks;
import com.atm.app.Account;
import com.atm.app.AtmServer;
import com.atm.app.CashSlot;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class ServerHooks {
    public static final int PORT = 9988;
    private AtmServer server;
    
    @Autowired
    Account account;
    
    @Autowired
    CashSlot cashSlot;
    
    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT, cashSlot, account);
        server.start();
        System.out.println("**** El Servidor ha sido iniciado.");
    }
    @After
    public void stopServer() throws Exception {
        server.stop();
        System.out.println("**** El Servidor ha sido detenido.");
    }
}