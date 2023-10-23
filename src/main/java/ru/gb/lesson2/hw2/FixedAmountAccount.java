package ru.gb.lesson2.hw2;
public class FixedAmountAccount extends AbstractAccount {
    private final double fixedAmount;
    public FixedAmountAccount(double fixedAmount, double balance) {
        super(balance);
        this.fixedAmount = fixedAmount;
    }
    @Override
    public double getAmount() {
        return fixedAmount;
    }

    @Override
    public void put(double amount) {
        System.out.println("Аккаунт неизменяемый. Добавление невозможно.");
    }
    @Override
    public void take(double amount) {
        System.out.println("Аккаунт неизменяемый. Снятие невозможно.");
    }
}
