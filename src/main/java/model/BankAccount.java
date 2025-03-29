package model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "accountType"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CurrentAccount.class, name = "C"),
    @JsonSubTypes.Type(value = SavingsAccount.class, name = "P")
})

public abstract class BankAccount {

    @JsonProperty("name")
    protected String name;
    @JsonProperty("cpf")
    protected String cpf;
    @JsonProperty("accountType")
    protected String accountType;
    @JsonProperty("balance")
    protected double balance;

    // Constructor corrigido - agora inicializa os campos
    @JsonCreator
    public BankAccount(
            @JsonProperty("accountType") String accountType,
            @JsonProperty("name") String name,
            @JsonProperty("cpf") String cpf,
            @JsonProperty("balance") double balance) {
        this.accountType = accountType;
        this.name = name;
        this.cpf = cpf;
        this.balance = balance;
    }

    //getters and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    //public methods
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("ERRO: Saldo insuficiente!");
        }

    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void transfer(double amount, int cpf) {
        //
    }

    @Override
    public String toString() {
        return "BankAccount{"
                + "accountType='" + accountType + '\''
                + ", name='" + name + '\''
                + ", cpf=" + cpf
                + ", balance=" + balance
                + '}';
    }

    //abstract methods
    protected abstract void tariff(double type);

}
