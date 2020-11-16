package ch.teko.prg.tag02.work;

public class Book {
    // Variabeln
    public String titel;
    public String autor;
    public Double preis;
    public int jahr;

    //Konstruktoren
    public Book(String titel, String autor, Double preis, int jahr){
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.jahr = jahr;
    }

    public Book(String titel, String autor){
        this.titel = titel;
        this.autor = autor;
        this.preis = 0.0;
        this.jahr = -1;
    }

    public String getTitel(){
        return titel;
    }
    public String getAutor(){
        return autor;
    }

    public void setJahr(int Jahr){
        this.jahr = jahr;
    }

    public void setPreis(double preis){
        this.preis = preis;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Herr der Ringe", "Steve Jobs", 23.90, 2019);
        System.out.println(book1.getAutor());
    }
}
