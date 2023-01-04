package org.example;

public class RedovniStudent extends Student {

    private int godinaStudija;
    private int brojPrijava;

    public RedovniStudent(Kategorija kategorija, String ime, String prezime, String smer, Datum datumPrijave, Ispit ispit, int godinaStudija, int brojPrijava) {
        super(kategorija, ime, prezime, smer, datumPrijave, ispit);
        this.godinaStudija = godinaStudija;
        this.brojPrijava = brojPrijava;
    }

    public RedovniStudent(RedovniStudent other) {
        super(other);
        this.godinaStudija = other.godinaStudija;
        this.brojPrijava = other.brojPrijava;
    }

    @Override
    int uplata() {
        if (brojPrijava < 3) {
            return 0;
        }

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
