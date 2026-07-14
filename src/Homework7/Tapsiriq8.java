package Homework7;

import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir nəfərin yaşını daxil et: ");
        int yas = sc.nextInt();

        int birBiletQiymeti = 0;

        if (yas >= 0 && yas <= 6) {
            birBiletQiymeti = 0;
        } else if (yas >= 7 && yas <= 17) {
            birBiletQiymeti = 2;
        } else if (yas >= 18 && yas <= 60) {
            birBiletQiymeti = 5;
        } else if (yas >= 61) {
            birBiletQiymeti = 3;
        } else {
            System.out.println("Yanlış yaş daxil edilib!");

        }

        System.out.println("Bir bilet üçün qiymət: " + birBiletQiymeti + " AZN");

        System.out.print("Neçə bilet alacaqsınız? ");
        int biletSayi = sc.nextInt();

        int umumiMebleg = birBiletQiymeti * biletSayi;
        System.out.println("Ümumi məbləğ: " + umumiMebleg + " AZN");

        sc.close();
    }
}