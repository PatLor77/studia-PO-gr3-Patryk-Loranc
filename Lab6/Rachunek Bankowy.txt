public class RachunekBankowy {




    private static double rocznaStopaProcentowa;
    private double saldo;


    RachunekBankowy(double saldo){
        this.saldo = saldo;


    }

    public double obliczMiesieczneOdsetki(double saldo){
        double odsetki = saldo*rocznaStopaProcentowa/12;
        this.saldo +=odsetki;
        return odsetki;

    }

    public void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    public double getSaldo() {
        return saldo;
    }
}