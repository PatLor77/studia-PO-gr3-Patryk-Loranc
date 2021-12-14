package com.company;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDsate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public int compareTo(Osoba o) {
        int compareValue = 0;
        if (this.nazwisko.compareTo(o.nazwisko) == 0) {
            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) == 0) {
                compareValue = 0;
            }

            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0) {
                compareValue += 100;
            }

            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0) {
                compareValue -= 100;
            }
        }

        if (this.nazwisko.compareTo(o.nazwisko) > 0) {
            compareValue += 100;
            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) == 0) {
                compareValue += 0;
            }

            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0) {
                compareValue += 10;
            }

            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0) {
                compareValue -= 10;
            }
        }

        if (this.nazwisko.compareTo(o.nazwisko) < 0) {
            compareValue -= 100;
            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) == 0) {
                compareValue += 0;
            }

            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0) {
                compareValue += 10;
            }

            if (this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0) {
                compareValue -= 10;
            }
        }

        return compareValue;
    }

    public boolean equals(Osoba o) {
        return this.nazwisko.equals(o.nazwisko) && this.dataUrodzenia.equals(o.dataUrodzenia);
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        String rtn = var10000 + "[" + this.nazwisko + "]" + this.dataUrodzenia;
        return rtn;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }
}
