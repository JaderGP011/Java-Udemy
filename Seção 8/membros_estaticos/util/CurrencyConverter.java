package membros_estaticos.util;

public class CurrencyConverter {
    public double dolarPrice;
    public double amountDollars;
    public double paidBrl;

    public double convertDollar(double dolarPrice, double amountDollars) {
        double iof = 0.06;
        return  dolarPrice * amountDollars + (dolarPrice * amountDollars * iof);
    }
}