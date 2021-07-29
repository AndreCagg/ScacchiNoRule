package com.example.scacchitps;

public class Alfiere extends Pezzo implements Punteggio {

    public Alfiere(Integer x, String colore, Character y) {
        super(x, colore, y, "Alfiere" + colore.substring(0, 1), ALFIERE); //"Alfiere" + colore.substring(0, 1) serve per stampare la squadra (b/n)
    }

    @Override
    public String toString() {
        return "Alfiere{" + super.toString();
    }
}
