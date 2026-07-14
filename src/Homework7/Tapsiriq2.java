package Homework7;

import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double umumiMebleg = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "-ci günün satışı: ");
            double satis = sc.nextDouble();
            umumiMebleg = umumiMebleg + satis;
        }
        double ortaSatis = umumiMebleg / 3;
        System.out.println("Ümumi məbləğ: " + umumiMebleg);
        System.out.println("Orta günlük satış: " + ortaSatis);

        if (ortaSatis > 500) {
            System.out.println("Həftə uğurludur");
        } else {
            System.out.println("Satışı artırmaq lazımdır");
        }
        sc.close();

    }
}


