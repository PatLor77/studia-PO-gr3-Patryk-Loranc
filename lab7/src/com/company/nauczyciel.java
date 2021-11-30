package com.company;

public class Nauczyciel extends Osoba {

    private double pensja;


    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }
}