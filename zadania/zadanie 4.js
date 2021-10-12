public class Main {

    public static void main(String[] args) {
    int year = 1;
    double kwota = 1000;
//        double nowa_kwota = kwota*(1+0.06)*Math.sqrt(year);
    for(int i = 0; i < 3; i++){
    kwota = kwota*(1+0.06)*Math.sqrt(year);
    System.out.print(" " + "kwota" + year +":"+ " ");
    System.out.print(kwota);
    year = year + 1;
}
}
}