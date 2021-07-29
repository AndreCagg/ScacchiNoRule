package com.example.scacchitps;

public class Re extends Pezzo implements Punteggio {

    public Re(Integer x, String colore, Character y) {
        super(x, colore, y, "Re" + colore.substring(0, 1), 0);
    }

    @Override
    public String toString() {
        return "Re{" + super.toString();
    }
}
