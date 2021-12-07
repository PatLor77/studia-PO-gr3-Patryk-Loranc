package com.company.Instruments;
import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji ){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;

    }





    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
    public abstract void dzwiek();

    public boolean equals(String producent, LocalDate rokProdukcji){
        if(this.producent.equals(producent) && this.rokProdukcji.equals(rokProdukcji))
            return true;
        else
            return false;


    }
    public String toString(){
        return "Producent: " + this.producent + "\nRok produkcji: " + this.rokProdukcji.toString();

    }


}