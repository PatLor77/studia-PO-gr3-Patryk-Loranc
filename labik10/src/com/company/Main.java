package com.company;
import com.Osoba.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = "1997-10-21";
        String date2 = "1997-10-20";
        String date3 = "1998-11-10";


        LocalDate ld1 = LocalDate.parse(date, formatter);
        LocalDate ld2 = LocalDate.parse(date2, formatter);
        LocalDate ld3 = LocalDate.parse(date3, formatter);

        Osoba o1 = new Osoba("Loranc", ld1);
        Osoba o2 = new Osoba("Nowak", ld2);
        Osoba o3 = new Osoba("Nowak", ld3);
        Osoba o4 = new Osoba("Kowalski", ld2);
        Osoba o5 = new Osoba("Adamski", ld1);
        Osoba o6 = new Osoba("Adamski", ld1);

        ArrayList<Osoba> listaO = new ArrayList<Osoba>();
        listaO.add(o1);
        listaO.add(o2);
        listaO.add(o3);
        listaO.add(o4);
        listaO.add(o5);
        listaO.add(o6);
//

        listaO.sort(Comparator.naturalOrder());
        System.out.println(listaO);
        ArrayList<Student> listaS = new ArrayList<Student>();
        Student s1 = new Student(o1.getNazwisko(), o1.getDataUrodzenia(), 4.50);
        Student s2 = new Student(o2.getNazwisko(),o2.getDataUrodzenia(), 4.75);
        Student s3 = new Student(o3.getNazwisko(),o3.getDataUrodzenia(), 3.75);
        Student s4 = new Student(o4.getNazwisko(),o4.getDataUrodzenia(), 3.50);
        Student s5 = new Student(o5.getNazwisko(),o5.getDataUrodzenia(), 4.25);
        Student s6 = new Student(o6.getNazwisko(), o6.getDataUrodzenia(), 4.26);
        Student s7 = new Student(o6.getNazwisko(), o6.getDataUrodzenia(), 4.24);
        listaS.add(s1);
        listaS.add(s2);
        listaS.add(s3);
        listaS.add(s4);
        listaS.add(s5);
        listaS.add(s7);
        listaS.add(s6);




        listaS.sort(Comparator.naturalOrder());
        System.out.println(listaS);
        listaS.sort(Comparator.reverseOrder());
        System.out.println(listaS);
    }


}