package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    void getBalance() {
        System.out.println("잔고 : " + balance);
    }
}
