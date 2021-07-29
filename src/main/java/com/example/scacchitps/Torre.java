package com.example.scacchitps;

public class Torre extends Pezzo implements Punteggio {

    public Torre(Integer x, String colore, Character y) {
        super(x, colore, y, "Cavallo" + colore.substring(0, 1), TORRE);
    }

    @Override
    public String toString() {
        return "Torre{" + super.toString();
    }
}
