package fixacao1.util;


public class Account {
    private int nmrConta;
    private String nomeTitular;
    private double saldo = 0;

    //CONSTRUCTORS
    public Account(int nmrConta, String nomeTitular, double saldo){
        this.nmrConta = nmrConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }


    public double deposit(double value) {
        this.saldo = saldo + value;
        return this.saldo;
    }
    
    public double withdraw(double value) {
        value = value + 5.00;
        this.saldo = saldo - value;
        return this.saldo;
    }

    public void show(){
    System.out.printf("Account data: \n Account ", nmrConta, ", Holder: ", nomeTitular, ", Balance $ %.2f%n", saldo );
    }

    
}

