 public class Kalendarz {
    public boolean czyPrzestepny(int rok){
    return (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);

    }
}
 class zad_4{
    public static void main(String[] args) {
        Kalendarz kalendarz = new Kalendarz();

        System.out.println(kalendarz.czyPrzestepny(2026));
        System.out.println(kalendarz.czyPrzestepny(2023));
        System.out.println(kalendarz.czyPrzestepny(2021));
        System.out.println(kalendarz.czyPrzestepny(2020));
        System.out.println(kalendarz.czyPrzestepny(2018));
        System.out.println(kalendarz.czyPrzestepny(2009));
        System.out.println(kalendarz.czyPrzestepny(2003));
    }
}