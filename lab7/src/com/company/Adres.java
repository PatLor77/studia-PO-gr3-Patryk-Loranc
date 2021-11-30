package com.company;

import java.util.Optional;

public class Adres {
    private String ulica;
    private int nrDomu;
    private Optional nrMieszkania;
    private String miasto;
    private String kod;

    public Adres(String ulica, int nrDomu, Optional nrMieszkania, String miasto, String kod) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.miasto = miasto;
        this.kod = kod;
    }

    public Adres(String ulica, int nrDomu, String miasto, String kod) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.miasto = miasto;
        this.kod = kod;
    }
    public void show(){
        System.out.print(kod + ", " + miasto + "\n"+ ulica + ", "+nrDomu+", "+ nrMieszkania);

    }

    public boolean przed(Adres a1, Adres a2){
        boolean spr = false;
        if(a1.kod == a2.kod){
            spr =  true;
        }
        return spr;
    }



}