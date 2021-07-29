package com.example.scacchitps;

public class Pedone extends Pezzo implements Punteggio {

    public Pedone(Integer x, String colore, Character y) {
        super(x, colore, y, "Pedone" + colore.substring(0, 1), PEDONE);
    }

    @Override
    public String toString() {
        return "Pedone{" + super.toString();
    }
}
