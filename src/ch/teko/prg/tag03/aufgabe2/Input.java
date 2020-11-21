package ch.teko.prg.tag03.aufgabe2;

import java.util.Scanner;


public class Input {
    //Attribute
    int firstNumber;
    int secondNumber;

    //Konstruktore
    public Input() {
    this.firstNumber = 0;
    this.secondNumber = 0;
    }

    //Methoden
    public void setNumbers(int firstNumber, int secondNumber){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int numberOne = Integer.parseInt(name);
        this.firstNumber = numberOne;


        Scanner sc2=new Scanner(System.in);
        String name2=sc.next();
        int numberTwo = Integer.parseInt(name);
this.secondNumber = numberTwo;
    }
}

