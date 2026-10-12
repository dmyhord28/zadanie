import java.util.Scanner; // Импортируем класс Scanner

// Класс Osoba
class Osoba {
    private String imie;
    private int wiek;

    // Конструктор
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    // Метод для вывода приветствия
    public void wyswietlPowitanie() {
        System.out.println("Cześć, mam na imię " + imie + " i mam " + wiek + " lat.");
    }

    public static void main(String[] args) {
        // Создаём объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрос имени
        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine(); // Читаем текстовую строку

        // Запрос возраста
        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt(); // Читаем целое число

        // Создаём объект класса Osoba с полученными данными
        Osoba osoba = new Osoba(imie, wiek);

        // Вызываем метод приветствия[cite: 3]
        osoba.wyswietlPowitanie();

        // Закрываем Scanner
        scanner.close();
    }

}

// Главный класс

