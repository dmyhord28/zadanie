class Ksiazka{
    String tytul;
    String autor;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }
}
public class zad2 {
    public static void main(String[] args) {
        Ksiazka ksiazka = new Ksiazka("Wiedźmin", "Andrzej Sapkowski");
        System.out.println("Książka: " + ksiazka.tytul + " - " + ksiazka.autor);
    }
}