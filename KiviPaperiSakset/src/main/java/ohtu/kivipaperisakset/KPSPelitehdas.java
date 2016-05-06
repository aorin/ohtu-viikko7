package ohtu.kivipaperisakset;

public class KPSPelitehdas {

    public static KPSPeli annaKPSPeli(String vastaus) {
        if (vastaus.endsWith("a")) {
            return new KPSPelaajaVsPelaaja();
        } else if (vastaus.endsWith("b")) {
            return new KPSTekoaly(new Tekoaly());
        } else if (vastaus.endsWith("c")) {
            return new KPSTekoaly(new TekoalyParannettu(20));
        } else {
            return null;
        }
    }
}
