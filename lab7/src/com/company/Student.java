package com.company;

public class Student extends Osoba {
    private String kierunek;


    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;

    }

    public String getKierunek() {
        return kierunek;
    }


}