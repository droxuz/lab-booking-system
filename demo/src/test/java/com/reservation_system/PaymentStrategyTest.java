package com.reservation_system;

import org.junit.jupiter.api.Test;

import com.reservation_system.patterns.strategy.CreditCardPayment;
import com.reservation_system.patterns.strategy.DebitCardPayment;
import com.reservation_system.patterns.strategy.GrantPayment;
import com.reservation_system.patterns.strategy.InstitutionalPayment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentStrategyTest {

    @Test
    void creditCardHasCorrectName() {
        CreditCardPayment cc = new CreditCardPayment();
        assertEquals("Credit Card", cc.getMethodName());
    }

    @Test
    void debitCardHasCorrectName() {
        DebitCardPayment dc = new DebitCardPayment();
        assertEquals("Debit Card", dc.getMethodName());
    }

    @Test
    void institutionalAccountHasCorrectName() {
        InstitutionalPayment inst = new InstitutionalPayment();
        assertEquals("Institutional Account", inst.getMethodName());
    }

    @Test
    void grantPaymentHasCorrectName() {
        GrantPayment gp = new GrantPayment();
        assertEquals("Research Grant", gp.getMethodName());
    }

    // just making sure pay() doesn't blow up for each type
    @Test
    void creditCardPayDoesNotThrow() {
        assertDoesNotThrow(() -> new CreditCardPayment().pay(99.99));
    }

    @Test
    void debitCardPayDoesNotThrow() {
        assertDoesNotThrow(() -> new DebitCardPayment().pay(50.00));
    }

    @Test
    void institutionalPayDoesNotThrow() {
        assertDoesNotThrow(() -> new InstitutionalPayment().pay(200.00));
    }

    @Test
    void grantPayDoesNotThrow() {
        assertDoesNotThrow(() -> new GrantPayment().pay(0.01));
    }

    @Test
    void payWithZeroAmountIsOk() {
        assertDoesNotThrow(() -> new CreditCardPayment().pay(0.0));
    }
}