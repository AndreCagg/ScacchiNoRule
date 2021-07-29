package com.example.scacchitps;

public class Cavallo extends Pezzo implements Punteggio {

    public Cavallo(Integer x, String colore, Character y) {
        super(x, colore, y, "Cavallo" + colore.substring(0, 1), CAVALLO);
    }

    @Override
    public String toString() {
        return "Cavallo{" + super.toString();
    }
}
