class Pies {
    String imie;
    int wiek;
}

public class zad1 {
    public static void main(String[] args) {
        Pies mojPies = new Pies();
        mojPies.imie = "Reksio";
        mojPies.wiek = 3;

        System.out.println("Pies: " + mojPies.imie + ", Wiek: " + mojPies.wiek + " lata");
    }
}
