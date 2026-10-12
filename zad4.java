class KalkulatorProstokata {
    public double obliczPole(double a, double b){
        return a * b;
    }
}

public class zad4 {
    public static void main(String[] args) {
        KalkulatorProstokata kalkulator = new KalkulatorProstokata();
        double pole = kalkulator.obliczPole(5.5, 4.0);
        System.out.println("Pole prostokąta: " + pole);
    }
}