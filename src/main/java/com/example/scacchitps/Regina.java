package com.example.scacchitps;

public class Regina extends Pezzo implements Punteggio {

    public Regina(Integer x, String colore, Character y) {
        super(x, colore, y, "Regina" + colore.substring(0, 1), REGINA);
    }

    @Override
    public String toString() {
        return "Regina{" + super.toString();
    }

}
