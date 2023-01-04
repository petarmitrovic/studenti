package org.example;

public class Samofinansirajuci extends Student {

    private int godinaStudija;

    public Samofinansirajuci(Kategorija kategorija, String ime, String prezime, String smer, Datum datumPrijave, Ispit ispit, int godinaStudija) {
        super(kategorija, ime, prezime, smer, datumPrijave, ispit);
        this.godinaStudija = godinaStudija;
    }

    public Samofinansirajuci(Samofinansirajuci other) {
        super(other);
        this.godinaStudija = other.godinaStudija;
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
        return this.godinaStudija >= ispit.getGodina();
    }
}
