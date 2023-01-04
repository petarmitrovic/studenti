package org.example;

public class Datum {

    private static final int[] DANI_U_MESECU = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private final int dan;
    private final int mesec;
    private final int godina;

    public Datum(int dan, int mesec, int godina) {
        validiraj(dan, mesec, godina);

        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
    }

    public Datum(Datum other) {
        this.dan = other.dan;
        this.mesec = other.mesec;
        this.godina = other.godina;
    }

    private void validiraj(int dan, int mesec, int godina) {
        if (mesec < 1 || mesec > 12) {
            throw new IllegalDatumException(String.format("Mesec mora imati vrednost izmedju 1 i 12. Nadjeno %d.", mesec));
        }

        boolean prestupnaGodina = (godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0);
        // februar u prestupnoj godini ima dan vise
        int brojDanaUMesecu = (prestupnaGodina && (mesec == 2)) ? (DANI_U_MESECU[mesec - 1] + 1) : DANI_U_MESECU[mesec - 1];
        if (dan < 0 || dan > brojDanaUMesecu) {
            throw new IllegalDatumException(String.format("Mesec %d moze imati dan izmedju 1 i %d. Nadjeno %d.", mesec, brojDanaUMesecu, dan));
        }
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d.", dan, mesec, godina);
    }

    public static Datum parse(String unos) {
        if (unos.length() != 11 || !Character.isDigit(unos.charAt(0)) || !Character.isDigit(unos.charAt(1))
                || unos.charAt(2) != '.' || !Character.isDigit(unos.charAt(3)) || !Character.isDigit(unos.charAt(4))
                || unos.charAt(5) != '.' || !Character.isDigit(unos.charAt(6)) || !Character.isDigit(unos.charAt(7))
                || !Character.isDigit(unos.charAt(8)) || !Character.isDigit(unos.charAt(9)) || unos.charAt(10) != '.') {
            throw new IllegalArgumentException("Ocekivani format za unos datuma je dd.mm.gggg. Nadjeno: " + unos);
        }

        int dan = Integer.parseInt(unos, 0, 2, 10);
        int mesec = Integer.parseInt(unos, 3, 5, 10);
        int godina = Integer.parseInt(unos, 6, 10, 10);
        return new Datum(dan, mesec, godina);
    }
}
