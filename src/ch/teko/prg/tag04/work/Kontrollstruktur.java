package ch.teko.prg.tag04.work;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.LongSummaryStatistics;

public class Kontrollstruktur {
    //Attribute
    public String name;
    public double version;
    public double preis;
    public int alter;
    public int punkte;
    public int i;


    //Konstruktoren
    public Kontrollstruktur(String name){
        this.name = name;
        this.alter = 0;
        this.preis = 0.0;
        this.punkte = 0;
    }
    public Kontrollstruktur(int punkte){
        this.punkte = punkte;
    }

    public Kontrollstruktur(){
        this.i = 10;
    }

    //Methoden
    public void setName(String name){
        this.name = name;
    }

    public void setVersion(double version){
        this.version = version;
    }

    public void setPreis(double preis){
        this.preis = preis;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName(){
        return name;
    }

    public double getVersion(){
        return version;
    }

    public double getPreis() {
        return preis;
    }

    public int getAlter(){
        return alter;
    }

    public int getPunkte(){
        return punkte;
    }

    public double calculatePrice(int alter){
        if (alter < 6){
            preis = 0.0;
            return preis;
        } else if (alter > 6 && alter < 12){
            preis = 5.0;
            return preis;
        } else if (alter > 12 && alter < 18){
            preis = 10.0;
            return preis;
        } else if (alter >= 18 && alter < 65){
            preis = 15.0;
            return preis;
        } else {
            preis = 15.0 / 2;
            return preis;
        }

    }

    public String testEvaluation(int punkte){
        switch (punkte) {
            case 10:
                return "Ergebnis: Sehr gut";


            case 9:
                return "Ergebnis: Gut";


            case 8:
                return "Ergebnis: Befriedigend";


            case 7:
                return "Ergebnis: Ausreichend";
        }

        if (punkte < 7 && punkte >= 0){
            return "Ergebnis: Leider nicht genug Punkte erreicht.";
        } else if (punkte > 10){
            return "Mehr als 10 Punkte angegeben!";
        } else if (punkte < -1){
            return "Keine Negativ-Punkte möglich!";
        }else{
            return "Bitte punktzahl eingeben!";
        }

    }

    public void counter(){
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}
