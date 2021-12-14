package Osoba;

import java.time.LocalDate;


public class Student extends Osoba implements Comparable<Osoba>, Cloneable {
    private double srednia;

    public Student(String nazwisko, LocalDate dataUrodzenia, double srednia) {

        super(nazwisko, dataUrodzenia);
        this.srednia=srednia;
    }



    public int compareTo(Student s) {
        Osoba o = new Osoba(s.getNazwisko(), s.getDataUrodzenia());
        int compareValue = super.compareTo(o);
        if(this.srednia > s.srednia)
            compareValue+=1;
        if (this.srednia < s.srednia)
            compareValue-=1;


        return compareValue;




    }


    public String toString(){
        String rtn = this.getClass().getSimpleName() + "[" + super.getNazwisko() + "]" + super.getDataUrodzenia() + ", " + this.srednia;
        return rtn;


    }

}