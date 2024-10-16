package model.entities;

import model.exception.InsufficientValue;
import model.exception.WithdrawLimit;

public class Account implements transitions {
    protected Integer number;
    protected String holder;
    protected double balance;
    protected double withdrawLimit;

    // Construtor padrão
    public Account() {
    }

    // Construtor com parâmetros
    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // Getters e Setters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Digite um valor válido para depósito.");
        } else {
            balance += amount;
            System.out.println("Depósito realizado com sucesso. Seu saldo atual: " + balance + " R$.");
        }
    }

    public void withdraw(double amount) {
        validatewithdraw(amount);;
        balance -= amount;

    }

    private void validatewithdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (amount > withdrawLimit) {
            throw new WithdrawLimit("Seu limite de saque é de: " + withdrawLimit + " R$.");
        }
        if (amount > balance) {
            throw new InsufficientValue("Saldo insuficiente. Seu saldo é de: " + balance + " R$.");
        }
    }


    @Override
    public String toString() {
        return "Número da conta: " + number +
                ", Nome do titular: " + holder +
                ", Saldo: " + balance + " R$.";
    }
}
