package org.example;

public class Ispit {

    // naziv ispita
    private String ime;
    // godina na kojoj se slusa
    private int godina;

    public Ispit(String ime, int godina) {
        this.ime = ime;
        this.godina = godina;
    }

    public Ispit(Ispit other) {
        this.ime = other.ime;
        this.godina = other.godina;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", this.ime, this.godina);
    }

    public String getIme() {
        return ime;
    }

    public int getGodina() {
        return godina;
    }
}
