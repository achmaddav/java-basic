package logic.logic01;

import logic.PrintArray;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class LogicNo01 {
    public static void main(String[] args) {
        soalNo01A(9);
        soalNo01B(9);
        soalNo01C(9);
        soalNo01D(9);
        soalNo01E(9);

        //soalNo10(9);
    }

    public static void soalNo01A(int n){
        System.out.println("Logic No 1 A");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void soalNo01B(int n) {
        System.out.println("Logic No 1 B");
        for (int a = 1; a <= n; a++) {
            System.out.print(a+"\t");
        }
        System.out.println();
    }

    public static void soalNo01C(int n) {
        System.out.println("Logic No 1 C");
        for (int b = 1; b <= n; b++) {
            System.out.print(b+"\t");
        }
        System.out.println();
    }

    public static void soalNo01D(int n) {
        System.out.println("Soal No 1 D");
        for (int c = 1; c <= n; c++) {
            System.out.print(c+"\t");
        }
        System.out.println();
    }

    public static void soalNo01E(int n) {
        System.out.println("Soal No 01 E");
        for (int d = 1; d <= n; d++) {
            System.out.print(d+"\t");
        }
        System.out.println();
    }

    public static void soalNo08(int n){
        String[] deret = new String[n];
        char huruf = 'A';
        int angka = 2;
        // isi array
        for (int i = 0; i < n; i++) {
            // genap dulu
            if(i % 2 == 0){
                deret[i] = String.valueOf(huruf);
            }else {
                deret[i] = String.valueOf(angka);
                angka+=2;
            }
            huruf++;
        }

        // print array
        PrintArray.print(deret);
    }

    public static void soalNo09(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(3,i);
        }

        // print array
        PrintArray.print(deret);
    }

    public static void soalNo10(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(i,3);
        }

        // print array
        PrintArray.print(deret);
    }
}
