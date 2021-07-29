package com.example.scacchitps;

public class Pezzo {

    protected Integer x, punteggio;
    protected String colore, name;
    protected Character y;

    public Pezzo(Integer x, String colore, Character y, String name, Integer punteggio) {
        this.x = x;
        this.colore = colore;
        this.y = y;
        this.name = name;
        this.punteggio = punteggio;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setY(Character y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPunteggio(Integer punteggio) {
        this.punteggio = punteggio;
    }

    public Integer getPunteggio() {
        return punteggio;
    }

    public String getName() {
        return name;
    }

    public Integer getX() {
        return x;
    }

    public String getColore() {
        return colore;
    }

    public Character getY() {
        return y;
    }

    @Override
    public String toString() {
        return " x=" + this.getX() + ", colore=" + this.getColore() + ", y=" + this.getY() + ", name=" + this.getName() + ", punteggio=" + this.getPunteggio();
    }

}
