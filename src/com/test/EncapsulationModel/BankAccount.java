package com.test.EncapsulationModel;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.BigDecimal.ZERO;
public class BankAccount {

    // encapsulation use private to hide data,
    // controlling what is available to outside world
    private String name;
    private BigDecimal balance;
    private boolean hasOverdraft;
    public BankAccount(){
    }
    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }
    public BankAccount(String name) {
        this.name = name;
        this.balance = ZERO;
        this.hasOverdraft = false;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if(balance.subtract(amount).compareTo(BigDecimal.ZERO)>=0){
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return ZERO;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return hasOverdraft == that.hasOverdraft && Objects.equals(name, that.name) && Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, hasOverdraft);
    }
}

//BankAccount bankAccount = new BankAccount(
//        "Sam",
//        BigDecimal.TEN,
//        false );
//
//        System.out.println(bankAccount.withdraw(new BigDecimal("9.0")));
//        System.out.println(bankAccount.getBalance());
