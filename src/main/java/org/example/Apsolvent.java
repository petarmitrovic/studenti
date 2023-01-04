package org.example;

import java.util.Set;

public class Apsolvent extends Student {

    private static final Set<String> ROKOVI_ZA_APSOLVENTE = Set.of("mart", "april", "novembar", "decembar");

    public Apsolvent(Kategorija kategorija, String ime, String prezime, String smer, Datum datumPrijave, Ispit ispit) {
        super(kategorija, ime, prezime, smer, datumPrijave, ispit);
    }

    public Apsolvent(Apsolvent other) {
        super(other);
    }

    @Override
    int uplata() {
        return 300;
    }

    @Override
    boolean moze(String rok) {
        return false;
    }

    @Override
    boolean odslusao() {
        return true;
    }

    @Override
    boolean imaPravoPolaganja(String rok) {
        return super.imaPravoPolaganja(rok) || ROKOVI_ZA_APSOLVENTE.contains(rok);
    }
}
