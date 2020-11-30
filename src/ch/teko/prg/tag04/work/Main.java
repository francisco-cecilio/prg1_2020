package ch.teko.prg.tag04.work;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.LongSummaryStatistics;

public class Main {
    public static void main(String[] args) {
        Kontrollstruktur Preisberechnen = new Kontrollstruktur("Preisberechnen");

        System.out.println("Preis Kind: " + Preisberechnen.calculatePrice(5));
        System.out.println("Preis Schüler: " + Preisberechnen.calculatePrice(7));
        System.out.println("Preis Jugendliche: " + Preisberechnen.calculatePrice(13));
        System.out.println("Preis Erwachsene: " + Preisberechnen.calculatePrice(18));
        System.out.println("Preis Rentner: " + Preisberechnen.calculatePrice(70));

        Kontrollstruktur Evaluation = new Kontrollstruktur(-2);
        System.out.println(Evaluation.testEvaluation(Evaluation.getPunkte()));

        Kontrollstruktur Counter = new Kontrollstruktur();
        Counter.counter();

        }
    }

