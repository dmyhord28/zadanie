class Uzytkownik {
    String login;
    boolean czyAktywny;

    public void wyswietlStatus() {
        if (czyAktywny) {
            System.out.println("Uzytkownik " + login + " jest zalogowany.");
        } else {
            System.out.println("Uzytkownik " + login + " jest nieaktywny.");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Uzytkownik user = new Uzytkownik();
        user.login = "Anna99";
        user.czyAktywny = true;
        user.wyswietlStatus();
    }
}