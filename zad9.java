class PrzetwarzanieTekstu {
    public boolean czyZaczynaSieOd(String slowo, char znak) {
        if (slowo == null || slowo.isEmpty()) return false;
        return slowo.charAt(0) == znak;
    }
}

public class zad9 {
    public static void main(String[] args) {
        PrzetwarzanieTekstu pt = new PrzetwarzanieTekstu();
        String test = "Java";
        char litera = 'J';

        System.out.println("Czy '" + test + "' zaczyna sie od '" + litera
                + "'? " + pt.czyZaczynaSieOd(test, litera));
    }
}