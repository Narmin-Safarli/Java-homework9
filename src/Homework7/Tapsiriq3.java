package Homework7;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stok = 200;
        int emeliyyat;

        System.out.println("Anbar idarəetmə sisteminə xoş gəlmisiniz!");
        System.out.println("İlkin stok: " + stok + " ədəd");
        System.out.println("(Mal gəlibsə müsbət ədəd, satılıbsa mənfi ədəd yazın. Çıxış üçün 0 daxil edin.)");
        System.out.println();

        while (true) {
            System.out.print("Əməliyyat sayını daxil et: ");
            emeliyyat = sc.nextInt();

            if (emeliyyat == 0) {
                break;
            }

            stok = stok + emeliyyat;

            System.out.println("Yeni stok: " + stok);
        }
        System.out.println();
        System.out.println("Proqram bitdi. Son stok statusu: " + stok);

        sc.close();
    }
}