class KontoBankowe {
    private double saldo;

    public double saldo() {
        return saldo;
    }

    public void setSaldo(double newSaldo) {
        if (newSaldo >= 0) {
            this.saldo = newSaldo;
        }
    }
}

public class zad5 {
    public static void main(String[] args) {
        KontoBankowe konto = new KontoBankowe();
        konto.setSaldo(1500.50);
        System.out.println("Stan konta: " + konto.saldo() + " zł");
    }
}