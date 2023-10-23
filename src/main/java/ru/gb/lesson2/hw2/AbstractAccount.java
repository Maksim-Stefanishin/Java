package ru.gb.lesson2.hw2;

public abstract class AbstractAccount {    protected double balance;
    public AbstractAccount(double initialBalance) {

        balance = initialBalance;

    }
    public  double getAmount()
    {
        return balance;
    }
    public void put(double amount) {

        if (amount < 0)
            throw new IllegalArgumentException("Сумма не может быть отрицательной");
        balance += amount;
    }
    public void take(double amount) {

        if (amount > balance)
            throw new ArithmeticException("Недостаточно средств");
        balance -= amount;
    }
}
