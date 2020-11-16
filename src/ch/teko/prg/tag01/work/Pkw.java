package ch.teko.prg.tag01.work;

public class Pkw {
    // --- Instanzvariabeln ---
    public String marke;
    public String modell;
    public int PS;


    // --- Konstruktioren ---

    public Pkw(String marke, String modell, int PS) {
        this.marke = marke;
        this.modell = modell;
        this.PS = PS;
    }

    // --- Methoden ---
    public String getMarke() {

        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getPs() {
        return PS;
    }

    public void setPs(int ps) {
        this.PS = ps;
    }

    public static void main(String[] args) {
        Pkw auto1 = new Pkw("mercedes", "c-klasse", 290);
        System.out.println(auto1.getPs());
        auto1.setPs(200);
        System.out.println(auto1.getPs());
    }

}
