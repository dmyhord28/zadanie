public class LiczbaAnalityk {

    private int liczba;

    public LiczbaAnalityk(int liczba) {
        this.liczba = liczba;
    }

    public boolean czyParzysta() {
        return this.liczba % 2 == 0;
    }

    public static void main(String[] args) {
        LiczbaAnalityk analityk1 = new LiczbaAnalityk(4);
        System.out.println(analityk1.czyParzysta());

        LiczbaAnalityk analityk2 = new LiczbaAnalityk(7);
        System.out.println(analityk2.czyParzysta());
    }
}