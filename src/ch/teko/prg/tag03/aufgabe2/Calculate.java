package ch.teko.prg.tag03.aufgabe2;

public class Calculate {
    //Attribute
    int sum;

    //Konstruktore
    public Calculate() {
    }

    //Methoden
    public int calcSum() {
        Input input1 = new Input();
        input1.setNumbers();
        sum = input1.firstNumber + input1.secondNumber;
        return sum;
    }
}
