package Homework7;

import java.util.Scanner;
public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gizliKod = 275;
        int cehdSayi = 0;
        int texmin = 0;
        while (texmin != gizliKod) {
            System.out.print("Kodu təxmin edin: ");
            texmin = sc.nextInt();
            cehdSayi++;

            if (texmin > gizliKod) {
                System.out.println("Böyükdür");
            } else if (texmin < gizliKod) {
                System.out.println("Kiçikdir");
            } System.out.println("Seyf açıldı!");
            System.out.println("Cəhd sayı: " + cehdSayi);

            sc.close();
        }
    }
}
