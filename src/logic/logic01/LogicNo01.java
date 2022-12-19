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
        soalNo02A(9);
        soalNo02B(9);
        soalNo02C(9);
        soalNo02D(9);
        soalNo02E(9);
        soalNo03A(9);
        soalNo03B(9);
        soalNo03C(9);
        soalNo03D(9);
        soalNo03E(9);
        soalNo04A(9);
        soalNo05A(9);

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
        System.out.println("\n=================================");
    }

    public static void soalNo02A(int n) {

        System.out.println("Soal No 2 A");

        int hasil = 0;
        int akhir = 0;
        int[] deret = new int[n];

        for (int i = 0; i < deret.length; i++) {
            if (i % 2 == 0) {
                if (i == 0) {
                    hasil = 1;
                    System.out.print(hasil + "\t");
                } else {
                    System.out.print(hasil + "\t");
                }
            } else {
                akhir = hasil * 3;
                System.out.print(akhir + "\t");
                hasil = akhir - i;
            }
        }
        System.out.println();
    }

    public static void soalNo02B(int n) {

        System.out.println("Soal No 2 B");

        int hasil = 0;
        int akhir = 0;
        int[] deret = new int[n];

        for (int a = 0; a < deret.length; a++) {
            if (a % 2 == 0) {
                if (a == 0) {
                    hasil = 1;
                    System.out.print(hasil+"\t");
                } else {
                    System.out.print(hasil+"\t");
                }
            } else {
                akhir = hasil * 3;
                System.out.print(akhir+"\t");
                hasil = akhir - a;
            }
        }
        System.out.println();
    }

    public static void soalNo02C(int n) {

        System.out.println("Soal No 2 C");

        int hasil = 0;
        int angka = 0;
        int[] deret = new int[n];

        for (int b = 0; b < deret.length; b++) {
            if (b % 2 ==0) {
                if (b == 0) {
                    hasil = 1;
                    System.out.print(hasil+"\t");
                } else {
                    System.out.print(hasil+"\t");
                }
            } else {
                angka = hasil * 3;
                System.out.print(angka+"\t");
                hasil = angka - b;
            }
        }
        System.out.println();
    }

    public static void soalNo02D(int n) {

        System.out.println("Soal No 2 D");

        int hasil = 0;
        int angka = 0;
        int[] deret = new int[n];

        for (int c = 0; c < deret.length; c++) {
            if (c % 2 == 0) {
                if (c == 0) {
                    hasil = 1;
                    System.out.print(hasil+"\t");
                } else {
                    System.out.print(hasil+"\t");
                }
            } else {
                angka = hasil * 3;
                System.out.print(angka+"\t");
                hasil = angka - c;
            }
        }
        System.out.println();
    }

    public static void soalNo02E(int n) {

        System.out.println("Soal No  2 E");

        int hasil = 0;
        int angka = 0;
        int[] deret = new int[n];

        for (int d = 0; d < deret.length; d++) {
            if (d % 2 == 0) {
                if (d == 0) {
                    hasil = 1;
                    System.out.print(hasil+"\t");
                } else {
                    System.out.print(hasil+"\t");
                }
            } else {
                angka = hasil * 3;
                System.out.print(angka+"\t");
                hasil = angka - d;
            }
        }
        System.out.println("\n=================================");
    }

    public static void soalNo03A(int n) {

        System.out.println("Soal No 3 A");

        int hasil = 0;
        int[] deret = new int[n];

        for (int i = 0; i < deret.length; i++) {
            System.out.print(hasil+"\t");
            hasil = hasil + 2;
        }
        System.out.println();
    }

    public static void soalNo03B(int n) {

        System.out.println("Soal No 3 B");

        int hasil = 0;
        int[] deret = new int[n];

        for (int a = 0; a < deret.length; a++) {
            System.out.print(hasil+"\t");
            hasil = hasil + 2;
        }
        System.out.println();
    }

    public static void soalNo03C(int n) {

        System.out.println("Soal No 3 C");

        int hasil = 0;
        int[] deret = new int[n];

        for (int b = 0; b < deret.length; b++) {
            System.out.print(hasil+"\t");
            hasil = hasil + 2;
        }
        System.out.println();
    }

    public static void soalNo03D(int n) {

        System.out.println("Soal No 3 D");

        int hasil = 0;
        int[] deret = new int[n];

        for (int c = 0; c < deret.length; c++) {
            System.out.print(hasil+"\t");
            hasil = hasil + 2;
        }
        System.out.println();
    }

    public static void soalNo03E(int n) {

        System.out.println("Soal No 3 E");

        int hasil = 0;
        int[] deret = new int[n];

        for (int d = 0; d < deret.length; d++) {
            System.out.print(hasil+"\t");
            hasil = hasil + 2;
        }
        System.out.println("\n=================================");
    }

    public static void soalNo04A(int n) {

        System.out.println("Soal No 4 A");

        int[] deret = new int[n];

        for (int i = 0; i < deret.length; i++) {
            if (i == 0 || i == 1) {
                deret[i] = 1;
                System.out.print(deret[i]+"\t");
            } else {
                deret[i] = deret[i-1] + deret[i-2];
                System.out.print(deret[i]+"\t");
            }
        }
    }

    public static void soalNo04B(int n) {

        System.out.println("Soal No 4 B");

        int[] deret = new int[n];

        for (int a = 0; a < deret.length; a++) {
            if (a == 0 || a == 1) {
                deret[a] = 1;
                System.out.print(deret[a]+"\t");
            } else {
                deret[a] = deret[a-1] + deret[a-2];
                System.out.print(deret[a]+"\n");
            }
        }
        System.out.println();
    }

    public static void soalNo04C(int n) {

        System.out.println("Soal No 4 C");

        int[] deret = new int[n];

        for (int b = 0; b < deret.length; b++) {
            if (b == 0 || b== 1) {
                deret[b] = 1;
                System.out.print(deret[b]+"\t");
            } else {
                deret[b] = deret[b-1] + deret[b-2];
                System.out.print(deret[b]+"\t");
            }
        }
        System.out.println();
    }

    public static void soalNo05A(int n) {

        System.out.println("\nSoal No 05 A");

        int[] deret = new int[n];

        for (int i = 0; i < deret.length; i++) {
            if (i == 0 || i == 1 || i == 2) {
                deret[i] = 1;
                System.out.print(deret[i]+"\t");
            } else {
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
                System.out.print(deret[i]+"\t");
            }
        }
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
