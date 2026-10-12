class Zwierze {
    public void dajGlos() {
        System.out.println("Zwierzę wydaje dźwięk");
    }
}

class PiesZad12 extends Zwierze {
    @Override
    public void dajGlos() {
        System.out.println("Hau hau!");
    }
}

class Kot extends Zwierze {
    @Override
    public void dajGlos() {
        System.out.println("Miau miau!");
    }
}

public class zad12 {
    public static void main(String[] args) {
        Zwierze[] zoo = new Zwierze[2];
        zoo[0] = new PiesZad12();
        zoo[1] = new Kot();

        for (Zwierze z : zoo) {
            z.dajGlos();
        }
    }
}