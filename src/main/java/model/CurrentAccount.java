package model;

import com.fasterxml.jackson.annotation.*;

public final class CurrentAccount extends BankAccount {

    private final Double universalTariff = 0.05;

    @JsonCreator
    public CurrentAccount(
            @JsonProperty("accountType") String accountType,
            @JsonProperty("name") String name,
            @JsonProperty("cpf") String cpf,
            @JsonProperty("balance") double balance) {
        super("C", name, cpf, balance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        this.tariff(this.universalTariff);
    }

    @Override
    public void transfer(double amount, int cpf) {
        //
        this.tariff(this.universalTariff);
    }

    @Override
    protected void tariff(double type) {
        this.balance -= this.balance * type;
    }
}
