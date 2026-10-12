class Samochod {
    String marka;

    public void pdpalSilnik(){
        System.out.println("Wrrr! Silnik działa.");
    }
}
public class zad3{
    public static void main(String[] args) {
        Samochod auto = new Samochod();
        auto.pdpalSilnik();
    }
}