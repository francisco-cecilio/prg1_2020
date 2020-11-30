package ch.teko.prg.tag03.aufgabe2;

import java.util.Scanner;


public class Input {
    //Attribute
    int firstNumber;
    int secondNumber;

    //Konstruktore
    public Input() {

    }

    //Methoden
    public void setNumbers() {
        Scanner firstInput = new Scanner(System.in);
        firstNumber = firstInput.nextInt();

        Scanner secondInput = new Scanner(System.in);
        secondNumber = secondInput.nextInt();
    }

    /*public int getFirstNumber(){
        return firstNumber;
    }

    public int getSecondNumber(){
        return secondNumber;
    }*/
}

