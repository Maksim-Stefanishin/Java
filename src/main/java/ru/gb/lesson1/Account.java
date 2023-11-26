package ru.gb.lesson1;
import java.time.LocalDate;

public  class Account {

    public static void main(String[] args) {
        DepositAccount depositAccount = new DepositAccount();
        System.out.println(depositAccount.getAmount());
        depositAccount.take(10);
        System.out.println(depositAccount.getAmount());
        depositAccount.take(10);
        System.out.println(depositAccount.getAmount());
        depositAccount.put(100);
        System.out.println(depositAccount.getAmount());
    }
    static double balance = 1000;


    public void put(double amount) {
        balance += amount;
    }

    public void take(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public double getAmount() {
        return balance;
    }


    public static class CreditAccount extends Account {
        @Override
        public void take(double amount) {
            double commission = amount * 0.01;
            amount += commission;
            super.take(amount);
        }

    }

    public static class DepositAccount extends Account {

        LocalDate lastWithdrawal;

        LocalDate today = LocalDate.now();

        LocalDate monthAgo = today.minusMonths(1);

        @Override
        public void take(double amount) {
            if (today.isAfter(monthAgo) && amount <= balance) {
                super.take(amount);
                lastWithdrawal = today;
            } else {
                System.out.println("Нельзя снимать средства чаще раза в месяц");
            }
        }
    }
}