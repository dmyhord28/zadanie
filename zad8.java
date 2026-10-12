class Produkt {
    String nazwa;
    double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public boolean czyTanszyNiz(Produkt innyProdukt) {
        return this.cena < innyProdukt.cena;
    }
}

public class zad8 {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Chleb", 4.50);
        Produkt p2 = new Produkt("Bulka", 1.20);

        System.out.println("Czy chleb jest tanszy niz bulka? " + p1.czyTanszyNiz(p2));
    }
}