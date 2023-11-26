package ru.gb.lesson2.hw2;
import java.time.LocalDate;
public class DepositAccount extends AbstractAccount {
    LocalDate lastWithdrawal;
    LocalDate today = LocalDate.now();
    LocalDate monthAgo = today.minusMonths(1);
    public DepositAccount(double balance) {

        super(balance);
    }

    @Override
    public void take(double amount) {        LocalDate lastWithdrawalCopy = lastWithdrawal;
        while (today.isAfter(monthAgo) && amount > 0) {
            if (today.equals(lastWithdrawalCopy)) {
                System.out.println("Снять " + amount + " за " + today + " Не удалось. Снятие разрешено раз в месяц ");

            } else {
                lastWithdrawal = today;
                balance -= amount;
            }
            return ;
        }
        System.out.println("Взято " + amount + " за " + today);    }
}
