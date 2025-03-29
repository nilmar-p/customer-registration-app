package model;

import com.fasterxml.jackson.annotation.*;

public final class SavingsAccount extends BankAccount {

    private final Double withdrawTariff = 0.08;
    private final Double transferTariff = 0.1;
    private final double depositBonus = 0.05;

    @JsonCreator
    public SavingsAccount(
            @JsonProperty("accountType") String accountType,
            @JsonProperty("name") String name,
            @JsonProperty("cpf") String cpf,
            @JsonProperty("balance") double balance) {
        super("P", name, cpf, balance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        this.tariff(withdrawTariff);
    }

    @Override
    public void transfer(double amount, int cpf) {
        super.transfer(amount, cpf);
        this.tariff(transferTariff);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        this.addBonus(depositBonus);
    }

    private void addBonus(double type) {
        this.balance += this.balance * type;
    }

    @Override
    protected void tariff(double type) {
        this.balance -= this.balance * type;
    }
}
