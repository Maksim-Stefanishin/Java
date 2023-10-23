package ru.gb.lesson2.hw2;

public class Main {
    public static void main(String[] args) {
        DepositAccount depositAccount = new DepositAccount(2000);
        FixedAmountAccount fixedAmountAccount = new FixedAmountAccount(5000, 1000);
        CreditAccount creditAccount = new CreditAccount(3000);

        depositAccount.take(100);
        depositAccount.take(100);

        System.out.println(depositAccount.getAmount());

        fixedAmountAccount.put(300);
        System.out.println(fixedAmountAccount.getAmount());

        creditAccount.take(250);
        System.out.println(creditAccount.getAmount());








    }
}