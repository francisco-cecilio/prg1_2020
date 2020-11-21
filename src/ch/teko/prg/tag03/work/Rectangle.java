package ch.teko.prg.tag03.work;


public class Rectangle {
    //Attribute
    String name;
    int xPosition;
    int yPosition;
    double laenge;
    double breite;
    double flaeche;

    //Konstruktoren
    public Rectangle(String name, int xPosition, int yPosition, double laenge, double breite) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.laenge = laenge;
        this.breite = breite;
        this.flaeche = 0.0;
    }

    public Rectangle(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.laenge = 1.0;
        this.breite = 1.0;
        this.flaeche = 0.0;
    }

    //Methoden

        //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

        //Getter

    public String getName(){
        return name;
    }
    public int getxPosition(){
        return xPosition;
    }
    public int getyPosition(){
        return yPosition;
    }
    private double getLaenge(){
        return laenge;
    }
    public double getBreite(){
        return breite;
    }


        //Fläche berechnen und zurückgeben
    private double flaecheBerechnen(){
        flaeche = breite * laenge;
        return flaeche;
    }

    public void flaecheAusgeben(){
        System.out.println(flaecheBerechnen());
    }

}
