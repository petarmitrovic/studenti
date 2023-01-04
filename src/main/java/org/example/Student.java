package org.example;

import java.util.Set;

abstract class Student {

    private static final Set<String> ROKOVI_ZA_SVE = Set.of("januar", "februar", "jun", "septembar", "oktobar");

    private Kategorija kategorija;
    private String ime;
    private String prezime;
    private String smer;
    private Datum datumPrijave;
    protected Ispit ispit;

    public Student(Kategorija kategorija, String ime, String prezime, String smer, Datum datumPrijave, Ispit ispit) {
        this.kategorija = kategorija;
        this.ime = ime;
        this.prezime = prezime;
        this.smer = smer;
        this.datumPrijave = datumPrijave;
        this.ispit = ispit;
    }

    public Student(Student other) {
        this.kategorija = other.kategorija;
        this.ime = other.ime;
        this.prezime = other.prezime;
        this.smer = other.smer;
        this.datumPrijave = other.datumPrijave;
        this.ispit = other.ispit;
    }

    abstract int uplata();
    boolean moze(String rok) {
        return imaPravoPolaganja(rok) && odslusao() && rokZaPrijavuJeIstekao(rok);
    }

    // pomocne metode
    boolean imaPravoPolaganja(String rok) {
        return ROKOVI_ZA_SVE.contains(rok);
    }
    abstract boolean odslusao();

    private boolean rokZaPrijavuJeIstekao(String rok) {
        throw new UnsupportedOperationException("Jos uvjek nije implementirano");
    }

    protected Datum krajnjiRok(String rok, int godina) {
        switch (rok) {
            case "januar":
                return new Datum(1, 1, godina);
            case "februar":
                return new Datum(1, 2, godina);
            case "mart":
                return new Datum(1, 3, godina);
            case "april":
                return new Datum(1, 4, godina);
            case "jun":
                return new Datum(1, 6, godina);
            case "septembar":
                return new Datum(1, 9, godina);
            case "oktobar":
                return new Datum(1, 10, godina);
            case "novembar":
                return new Datum(1, 11, godina);
            case "decembar":
                return new Datum(1, 12, godina);
            default:
                throw new IllegalArgumentException("Nepoznat rok: " + rok);
        }
    }
}
