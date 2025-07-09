package com.kajal.code.designPatterns.creationalDesignPatterns.Adapter;

public interface BankApi {
    public double getBalance(String accountNumber);
    public void sendMoney(String to , String from ,double amount);
}
