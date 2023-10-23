package ru.gb.lesson2.hw2;

public class CreditAccount extends AbstractAccount {


    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override        public void take(double amount) {

            double commission = amount * 0.01;            amount += commission;
            super.take(amount);
    }

    }




