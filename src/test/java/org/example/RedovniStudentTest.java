package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedovniStudentTest {

    @Test
    void uplataZaPrviPutBiTrebaloDaBude0() {
        Datum datum = Datum.parse("04.01.2022.");
        Ispit ispitOop = new Ispit("OOP", 1);
        RedovniStudent student = new RedovniStudent(Kategorija.REDOVNI, "Petar", "Petrovic", "SI", datum, ispitOop, 2, 2);

        assertEquals(0, student.uplata());
    }

    @Test
    void uplataZaTreciPutBiTrebaloDaBude300() {
        Datum datum = Datum.parse("04.01.2022.");
        Ispit ispitOop = new Ispit("OOP", 1);
        RedovniStudent student = new RedovniStudent(Kategorija.REDOVNI, "Petar", "Petrovic", "SI", datum, ispitOop, 2, 3);

        assertEquals(300, student.uplata());
    }
}