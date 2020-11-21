package ch.teko.prg.tag02.work;

public class Adresse {
    //Variabeln
    public String strasse;
    public int nummer;
    public int plz;
    public String wohnort;

    //Konstruktoren
    public Adresse(String strasse, int nummer, int plz, String wohnort){
        this.strasse = strasse;
        this.nummer =  nummer;
        this.plz = plz;
        this.wohnort = wohnort;
    }

    //Methoden
    public String getStrasse(){
        return strasse;
    }

    public String getWohnort() {
        return wohnort;
    }

    public int getNummer(){
        return nummer;
    }

    public int getPlz(){
        return plz;
    }

    public void setStrasse(){
        this.strasse = strasse;
    }

    public void setNummer(){
        this.nummer = nummer;
    }

    public void setPlz(){
        this.plz = plz;
    }

    public void setWohnort(){
        this.wohnort = wohnort;
    }
}
