package fixacao1.util;

public class Account {
    private int nmrConta;
    private String nomeTitular;
    private double saldo = 0;

    //CONSTRUCTORS
    public Account(int nmrConta, String nomeTitular, double saldo){
        this.nmrConta = nmrConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo; // atribui o saldo inicial
    }

    public Account(int nmrConta, String nomeTitular) {
        this.nmrConta = nmrConta;
        this.nomeTitular = nomeTitular;
    }

    public void deposit(double value) {
        saldo += value; // adiciona ao saldo
    }
    
    public void withdraw(double value) {
        saldo -= value + 5.00; // subtrai do saldo
    }

    public void show() {
        System.out.printf("Account data: %n Account, %d, Holder: %s, Balance, $ %.2f%n", nmrConta, nomeTitular, saldo);
    }
}
