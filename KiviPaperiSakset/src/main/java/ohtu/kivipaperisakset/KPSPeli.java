package ohtu.kivipaperisakset;

public abstract class KPSPeli {
    public static KPSPeli pelaajaVsPelaaja() {
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPSPeli pelaajaVsTekoaly() {
        return new KPSTekoaly(new Tekoaly());
    }
    
    public static KPSPeli pelaajaVsParannettuTekoaly() {
        return new KPSTekoaly(new TekoalyParannettu(20));
    }
    
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String ekanSiirto = ekanSiirto();
        String tokanSiirto = tokanSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = ekanSiirto();
            tokanSiirto = tokanSiirto();
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    protected abstract String ekanSiirto();
    protected abstract String tokanSiirto();

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
