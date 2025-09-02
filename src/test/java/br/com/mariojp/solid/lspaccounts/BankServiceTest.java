package br.com.mariojp.solid.lspaccounts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class BankServiceTest {

    @Test
    public void testCheckingAccountWithdrawal() {
        CheckingAccount checking = new CheckingAccount();
        checking.deposit(100);
        new BankService().processWithdrawal(checking, 30);
        assertEquals(70.0, checking.getBalance(), 0.0001);
    }

    @Test
    public void testSavingsAccountNoWithdrawal() {
        SavingsAccount savings = new SavingsAccount();
        savings.deposit(100);
        assertEquals(100.0, savings.getBalance(), 0.0001);
    }

}
