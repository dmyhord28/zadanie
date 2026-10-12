class Pojazd {
    String marka;

    public void trab() {
        System.out.println("Trąbienie: Biiiip!");
    }
}

class Rower extends Pojazd {
    int liczbaPrzerzutek;

    public void wyswietlSpecyfikacje() {
        System.out.println("Rower marki: " + marka + ", Przerzutki: " + liczbaPrzerzutek);
    }
}

public class zad11 {
    public static void main(String[] args) {
        Rower mojRower = new Rower();
        mojRower.marka = "Kross";
        mojRower.liczbaPrzerzutek = 21;

        mojRower.wyswietlSpecyfikacje();
        mojRower.trab();
    }
}