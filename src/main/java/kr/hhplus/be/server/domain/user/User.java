package kr.hhplus.be.server.domain.user;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String name;
    private int balance;

    public User(UUID id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void charge(int amount) {
        balance += amount;
    }

    public void pay(int amount) {
        if (canPay(amount)) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
        balance -= amount;
    }

    private boolean canPay(int amount) {
        return balance < amount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
