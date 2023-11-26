package ru.gb.lesson1.hw;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AccountTest {
    @Test
    void testPut1(){
        Account account = new Account(1000);
        account.put(100);
        double actualAmmount = account.getAmount();
        double expectedAmmount = 1100;
        Assertions.assertEquals(actualAmmount,expectedAmmount);

    }

    @Test
    void testPut(){
        Account account = new Account(1000);
        account.put(200);
        double actualAmmount = account.getAmount();
        double expectedAmmount = 1200;
        Assertions.assertEquals(actualAmmount,expectedAmmount);

    }

    @Test
    void testTake1(){
        Account account = new Account(1000);
        account.take(100);
        double actualAmmount = account.getAmount();
        double expectedAmmount = 900;
        Assertions.assertEquals(actualAmmount,expectedAmmount);

    }

    @Test
    void testTakeCredit1(){
        Account account = new CreditAccount(1000);
        account.take(100);
        double actualAmmount = account.getAmount();
        double expectedAmmount = 899;
        Assertions.assertEquals(actualAmmount,expectedAmmount);

    }
}
