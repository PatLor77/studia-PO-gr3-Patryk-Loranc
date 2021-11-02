package com.company;

import java.lang.StringBuffer;
import java.io.*;
import java.math.*;
import java.util.Scanner;
import static java.lang.Character.*;



public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //podpunkt a
//        String s = "ala ma kota";
//        char c = 'e';
//        System.out.println("w napisie " + a+ " znak " + l + " wystepuje tyle razy: " + countChar(a, l));
//        //b
//        String s = "ale ale ale aleksandra";
//        String sub = "ale";
//
//        System.out.println(countSubStr(s, sub));

        //c
//
//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//
//        System.out.println(middle(s));
        //d

//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//        System.out.println(repeat(s, 10));

        //e
//        String s = "ale ale ale aleksandra";
//        String sub = "al";
//        int[] tab = where(s, sub);
//        for(int i = 0; i <=tab.length-1; i++){
//            System.out.println(tab[i]);
//        }

        //f

//        System.out.println(change("ALE ALE"));

        //g

//        System.out.println(nice("1234567891", '|', 5));

        //Zad2
//        System.out.println(countFromFile("C:\Users\patry\IdeaProjects\untitled2\src", 'd'));


        //Zad3
//        System.out.println(countWordsFromFile("C:\Users\patry\IdeaProjects\untitled2\src", "Litwo"));

        //Zad4
//        System.out.println(seeds(100));

        //Zad5
//        System.out.println(odsetki(1000, 5, 20));




    }


    public static BigDecimal odsetki(double k, double p, int n){
        BigDecimal odsetki = new BigDecimal("1.0");
        odsetki = odsetki.add(new BigDecimal(""+p/100)).pow(n).multiply(new BigDecimal(""+k)).multiply(new BigDecimal(""+k)).multiply(new BigDecimal("0.001"));
        return odsetki;
    }


    public static BigInteger seeds(int n){
        BigInteger wynik = new BigInteger("0");
        BigInteger poprzedni = new BigInteger("1");
        BigInteger aktualny = new BigInteger("1");
        if(n != 0){
            for(int i = 1; i <=n; i++){
                for(int j = 1; j<=n; j++) {
                    wynik = wynik.add(aktualny);
                    aktualny = poprzedni.multiply(new BigInteger("2"));
                    poprzedni = aktualny;
                }
            }
        }
        return wynik;
    }
    public static int countWordsFromFile(String filePath, String word) throws FileNotFoundException {
        int counter = 0;
        Scanner sc = new Scanner(new File(filePath));
        while(sc.hasNext()){
            String compare = sc.next();
            if (compare.equalsIgnoreCase(word))
                counter++;
        }

        return counter;
    }
    public static int countFromFile(String filePath, char c) throws FileNotFoundException {
        int counter = 0;
        Scanner sc = new Scanner(new File(filePath));
        while(sc.hasNext()){
            String str = sc.next();
            for (int i = 0; i<=str.length()-1; i++){
                if(str.charAt(i) == c)
                    counter++;
            }
        }
        return counter;
    }

    public static String nice(String str , char separator, int range){
        StringBuffer decimal = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        int count = 0;
        for(int i = sb.length()-1; i >=0; i--){
            if(count  == range){
                decimal.append(separator);
                decimal.append(sb.charAt(i));
                count = 0;
            }
            else
                decimal.append(sb.charAt(i));
            count++;
        }
        return decimal.reverse().toString();
    }



    public static String change(String str){
        StringBuffer changed = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <=sb.length()-1; i++) {
            if (isLowerCase(sb.charAt(i)))
                changed.append(toUpperCase(sb.charAt((i))));
            if(isUpperCase(sb.charAt(i)))
                changed.append(toLowerCase(sb.charAt(i)));
        }


        return changed.toString();
    }

    public static int[] where(String str, String subStr){
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {
                    where[j] = i;
                    j++;

                }
            }
        }



        return where;
    }


    public static String repeat(String s, int n){
        StringBuffer sb = new StringBuffer();
        String str = s;
        for(int i = 0; i <= n-1; i++){
            sb.append(str);
        }

        return sb.toString();
    }


    public static String middle(String s){

        StringBuffer sb = new StringBuffer(s);
        StringBuffer str = new StringBuffer();
        if (sb.length()%2 == 0){
            str.append(sb.charAt(sb.length()/2-1)).append(sb.charAt(sb.length()/2));
        }
        if(s.length()%2 != 0){
            str.append(sb.charAt(sb.length()/2));
        }

        return str.toString();
    }

    public static int countSubStr(String str, String subStr){
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        if(subStr.length() > str.length())
            return 0;
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {

                    count++;
                }
            }
        }

        return count;

    }



    public static int countChar(String str, char c){
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if(sb.charAt(i) == c)
                count++;
        }


        return count;
    }

}