package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
//        Random r = new Random();
//
//        int n = r.nextInt(100 - 1) + 1;
//        int[] tab = new int[n];
//        for (int i = 0; i <= n - 1; i++) {
//            tab[i] = r.nextInt(1000 + 999) - 999;
//            System.out.println(tab[i]);
//        }
        //a
//        int counter1 = 0;
//        int counter2 = 0;
//        for(int i = 0; i <=tab.length-1; i++) {
//            if (tab[i] % 2 == 0)
//                counter1++;
//            if (tab[i] % 2 != 0)
//                counter2++;
//        }
//
//        System.out.println("Parzystych jest: " + counter1+ "\n Nieparzystych jest: "+counter2);

        //b
//        counter1 = 0;
//        counter2 = 0;
//        int counter3 = 0;
//        for(int i = 0; i <=tab.length-1; i++) {
//            if (tab[i] > 0)
//                counter1++;
//            if (tab[i] < 0)
//                counter2++;
//            if (tab[i] == 0)
//                counter3++;
//        }
//
//
//        System.out.println("dodatnich jest: "+ counter1+"\nujemnych jest: "+counter2+"\nzer jest:"+counter3);

        //c

//        int counter1 = 0;
//        int max = tab[0];
//        for(int i = 0; i <= n-2; i++){
//            if(max < tab[i+1])
//                max = tab[i+1];
//        }
//        for(int i = 0; i<=n-1; i++){
//            if(tab[i] == max)
//                counter1++;
//        }
//        System.out.println("max = "+max+"\n ilosc max w tablicy: "+counter1);


        //d
//        int suma1 = 0;
//        int suma2 = 0;
//        for(int i = 0; i<=n-1; i++){
//            if(tab[i] > 0)
//                suma1+=tab[i];
//            if(tab[i] < 0)
//                suma2+=tab[i];
//
//
//        }
//        System.out.println("suma dodatnich: "+ suma1 +"\nsuma ujemnych: "+suma2);

        //e

//        int count1 = 0;
//        int count2 = 0;
//        for(int i = 0; i<=n-1; i++){
//            if(tab[i] > 0)
//                count1++;
//            if(tab[i] < 0) {
//                if(count1 < count2)
//                count1 = 0;
//                else {
//                    count2 = count1;
//                    count1 = 0;
//                }
//
//            }
//
//        }
//        System.out.println("długosc: " + count2);
        //f
//        for(int i = 0; i<=n-1;i++){
//            if(tab[i] > 0)
//                tab[i] = 1;
//            if(tab[i] < 0)
//                tab[i] = -1;
//            System.out.println(tab[i]);
//        }
        //g
//        int lewy = r.nextInt(n-1)+1;
//        int prawy = r.nextInt(n-1)+1;
//        if(prawy < lewy) {
//            int bufor = lewy;
//            lewy = prawy;
//            prawy = bufor;
//        }
//        int bufor;
//
//
//
//        System.out.println("prawy = "+ prawy + "\nlewy = "+lewy);
//        for(int i = 0; i <=n-1; i++){
//            for(int j = n-1; j>=0; j-- ){
//                if(lewy-1 >= prawy-1)
//                    break;
//            if(i == lewy-1 && j == prawy-1){
//                bufor = tab[lewy-1];
//                tab[lewy-1] = tab[prawy-1];
//                tab[prawy-1] = bufor;
//                lewy++;
//                prawy--;
//
//            }
//
//            }
//        }
//
//
//            for(int i = 0; i <=n-1; i++){
//                System.out.println(tab[i]);
//            }


//        System.out.println(n);

        //Zad2
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj n");
//        int n = scan.nextInt();
//        int[] tab = new int[n];
//        int max = 999;
//        int min = -999;
//        generuj(tab, n, min, max);
//        wypisz(tab);
//        //a
//        System.out.println("Tyle nieparzystych: "+ileNieparzystych(tab));
//        System.out.println("Tyle parzystych: "+ileParzystych(tab));
//        //b
//        System.out.println("\nTyle dodatnich: "+ileDodatnich(tab));
//        System.out.println("Tyle ujemnych: "+ileUjemnych(tab));
//        System.out.println("Tyle zer: "+ileZer(tab));
//        //c
//        System.out.println("\nTyle maksymalnych: "+ileMax(tab));
//        //d
//        System.out.println("\nSuma dodatnich: "+ sumaDodatnich(tab));
//        System.out.println("\nSuma ujemnych: "+sumaUjemnych(tab));
//        //e
//        System.out.println("\nDługosc fragmentu z dodatnimi: "+ dlugoscDodatnia(tab));
//        //f
//        wypisz(signum(tab));
//        //g
//        wypisz(odwrocFragment(tab, 3, 7));

//        //3
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//
//
//        int m = scan.nextInt();
//        while (m < 0 || m > 10){
//            m=scan.nextInt();
//        }
//        int n = scan.nextInt();
//        while (n < 0 || n > 10){
//            n = scan.nextInt();
//        }
//        int k = scan.nextInt();
//        while (k < 0 || k > 10) {
//            k = scan.nextInt();
//        }
//
//        int[][] a = new int[m][n];
//        int[][] b = new int[n][k];
//        int[][] c = new int[m][k];
//
//        //wypelnianie a[]
//        for (int i = 0; i <= m-1; i++){
//            System.out.println();
//            for(int j = 0; j<=n-1; j++){
//                a[i][j] = r.nextInt(1000+999)-999;
//                System.out.print("["+a[i][j]+"]");
//            }
//        }
//        System.out.println();
//        System.out.println();
//        //wypelnianie b[]
//        for(int i = 0; i <=n-1; i++){
//            System.out.println();
//            for(int j = 0; j <=k -1; j++){
//                b[i][j] = r.nextInt(1000+999)-999;
//                System.out.print("["+b[i][j]+"]");
//            }
//
//        }
//        //mnozenie a[]xb[]
//        System.out.println("\n\n");
//        for(int i=0;i<m;i++){
//            for(int j=0;j<k;j++){
//                c[i][j]=0;
//
//                for(int l=0;l<n;l++)
//                {
//                    c[i][j]+=a[i][l]*b[l][j];
//                }
//                System.out.print("["+c[i][j]+"]");
//            }
//            System.out.println();
//        }









    }

    public static int[] odwrocFragment(int[] tab, int lewy, int prawy){

        if(prawy < lewy) {
            int bufor = lewy;
            lewy = prawy;
            prawy = bufor;
        }
        int bufor;

        for(int i = 0; i <=tab.length-1; i++){
            for(int j = tab.length-1; j>=0; j-- ){
                if(lewy-1 >= prawy-1)
                    break;
                if(i == lewy-1 && j == prawy-1){
                    bufor = tab[lewy-1];
                    tab[lewy-1] = tab[prawy-1];
                    tab[prawy-1] = bufor;
                    lewy++;
                    prawy--;

                }

            }
        }

        return tab;
    }

    public static int[] signum(int[] tab){
        int[] sgn = new int[tab.length];
        for (int i = 0; i<=tab.length-1; i++){
            if(tab[i] < 0)
                sgn[i] = -1;
            if(tab[i] > 0)
                sgn[i] = 1;
            if(tab[i] == 0)
                sgn[i] = 0;
        }

        return sgn;
    }

    public static int dlugoscDodatnia(int[] tab){

        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<=tab.length-1; i++){
            if(tab[i] > 0)
                count1++;
            if(tab[i] < 0) {
                if(count1 < count2)
                    count1 = 0;
                else {
                    count2 = count1;
                    count1 = 0;
                }
            }
        }
        return count2;

    }


    public static int sumaUjemnych(int[] tab){
        int suma = 0;
        for (int i = 0; i<=tab.length-1; i++){
            if(tab[i] < 0){
                suma +=tab[i];
            }

        }
        return suma;
    }

    public static int sumaDodatnich(int[] tab){
        int suma = 0;
        for (int i = 0; i<=tab.length-1; i++){
            if(tab[i] > 0){
                suma +=tab[i];
            }

        }
        return suma;
    }

    public static int ileMax(int[] tab){
        int ile = 0;
        int max = tab[0];
        for(int i = 0; i<= tab.length-1; i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        for(int i = 0; i <=tab.length-1; i++){
            if (tab[i] == max)
                ile++;
        }

        return ile;
    }

    public static int ileZer(int[] tab){
        int ile = 0;
        for(int i = 0; i <=tab.length-1;i++){
            if(tab[i] == 0)
                ile++;
        }

        return ile;
    }

    public static int ileUjemnych(int[] tab){
        int ile = 0;
        for(int i = 0; i <=tab.length-1;i++){
            if(tab[i] < 0 )
                ile++;
        }
        return ile;
    }

    public static int ileDodatnich(int[] tab){
        int ile = 0;
        for (int i = 0; i<= tab.length-1; i++){
            if(tab[i] > 0)
                ile++;
        }


        return ile;
    }


    public  static int ileParzystych(int[] tab){
        int ile = 0;
        for(int i = 0; i<=tab.length-1;i++){
            if(tab[i] %2 == 0){
                ile++;
            }
        }
        return ile;
    }

    public static int ileNieparzystych(int[] tab){
        int ile = 0;
        for(int i = 0; i <=tab.length-1; i++){
            if(tab[i]%2 != 0){
                ile++;
            }
        }

        return ile;
    }

    public static void generuj(int[] tab, int n, int min, int max){
        Random r = new Random();
        for(int i = 0; i<=n-1; i++){
            tab[i] = r.nextInt(max+1-min)+min;
        }


    }
    public static void wypisz(int[] tab){
        for (int i = 0; i <= tab.length-1; i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println("\n");

    }







}